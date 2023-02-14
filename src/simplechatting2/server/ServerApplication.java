package simplechatting2.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import lombok.Data;
import simplechatting2.dto.JoinReqDto;
import simplechatting2.dto.JoinRespDto;
import simplechatting2.dto.MessageReqDto;
import simplechatting2.dto.MessageRespDto;
import simplechatting2.dto.RequestDto;
import simplechatting2.dto.ResponseDto;

@Data

class ConnectedSocket extends Thread{
	private static List<ConnectedSocket> socketList = new ArrayList<>();
	private Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	private Gson gson;
	
	private String username;
	
	public ConnectedSocket (Socket socket) {
		this.socket = socket;
		gson = new Gson();
		socketList.add(this);
	}
	
	@Override
	public void run() {
		try {
			inputStream = socket.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
			
			while(true) {
				String request = in.readLine(); // requestDto(JSON) 이 들어온다.
				RequestDto requestDto = gson .fromJson(request, RequestDto.class);
				
				switch(requestDto.getResource()) {
					case "join": 
						JoinReqDto joinReqDto = gson.fromJson(requestDto.getBody(), JoinReqDto.class);
						username = joinReqDto.getUsername();
						List<String> connectedUsers = new ArrayList<>();
						for(ConnectedSocket connectedSocket : socketList) {
							connectedUsers.add(connectedSocket.getUsername());
						}
						
						JoinRespDto joinRespDto = new JoinRespDto(username + "님이 접속하였습니다.", connectedUsers);
						System.out.println(joinRespDto);
						
						sendToAll(requestDto.getResource(), "ok", gson.toJson(joinRespDto));
						break;
						
					case "sendMessage":
						MessageReqDto messageReqDto = gson.fromJson(requestDto.getBody(), MessageReqDto.class);
						
						if(messageReqDto.getToUser().equalsIgnoreCase("all")) {
							String message = messageReqDto.getFromUser() + "[전체]: " + messageReqDto.getMessageValue();
							MessageRespDto messageRespDto = new MessageRespDto(message);
							sendToAll(requestDto.getResource(), "ok", gson.toJson(messageRespDto));
						}else {
							String message = messageReqDto.getFromUser() + "["+ messageReqDto.getToUser()+"]:" + messageReqDto.getMessageValue();
							MessageRespDto messageRespDto = new MessageRespDto(message);
							sendToUser(requestDto.getResource(), "ok", gson.toJson(messageRespDto),messageReqDto.getToUser());
						}
							
						break;
				}
			}
				
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void sendToAll(String resource, String status, String body) throws IOException {
		ResponseDto responseDto = new ResponseDto(resource, status, body);
		for(ConnectedSocket connectedSocket : socketList) {
			OutputStream outputStream = connectedSocket.getSocket().getOutputStream();
			PrintWriter out = new PrintWriter(outputStream, true);
			
			out.println(gson.toJson(responseDto));
			
		}
	}
	private void sendToUser(String resource, String status, String body, String toUser) throws IOException {
		ResponseDto responseDto = new ResponseDto(resource, status, body);
		
		for(ConnectedSocket connectedSocket : socketList) {
			if(connectedSocket.getUsername().equals(toUser) || connectedSocket.getUsername().equals(username) ) {
				OutputStream outputStream = connectedSocket.getSocket().getOutputStream();
				PrintWriter out = new PrintWriter(outputStream, true);
				
				out.println(gson.toJson(responseDto));
			
			}	
			
		}
		
	}
}



public class ServerApplication {
	
	//1.서버소켓 객체를 먼저 생성한다.
	//2.먼저 포트를 쓰고있으면 다른 사용자가 못쓰기떄문에 예외처리한다.
	public static void main(String[] args) {
		
		//3.finally에서 사용하기 위해 전역변수로 빼준다.
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(9090);
			System.out.println("=====<<서버실행>>====="); //4.서버가 실행되면 무조건 무한루프를 돈다. accept하기 위해 
			
			
			while(true) {
				Socket socket = serverSocket.accept(); // 클라이언트의 접속을 기다리는 메소드 (리턴값은 socket)	
				ConnectedSocket connectedSocket = new ConnectedSocket(socket);
				connectedSocket.start();
			}

			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			if(serverSocket !=null) {
				try {
					serverSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("=====<<서버종료>>=====");
		}
		
	}
	
}
