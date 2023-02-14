package usermanagement.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class UserManagementApplication implements Runnable {
	
	private final static int PORT = 9090;
	private ServerSocket serverSocket;
	@Override
	public void run() {
		 try {
			serverSocket = new ServerSocket(PORT);
			System.out.println("==========<<서버 실행>>==========");
			
			
			socketConnetcion();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(serverSocket !=null) {
					serverSocket.close();
				}
				
				System.out.println("==========<<서버 종료>>==========");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	private void socketConnetcion() throws IOException {
		while(true) {
			Socket socket = serverSocket.accept();   //연결이 되면 다음으로 넘어간다.
			SocketServer socketServer = new SocketServer(socket); // new SocketServer = 쓰레드 라는 말이다.
			socketServer.start();   // start메소드가 호출이 되면 run메소드가 실행이된다.
		}
	}
	
	
	public static void main(String[] args) {
		UserManagementApplication application = new UserManagementApplication();
		application.run();
	
	}

	
}
