package usermanagement.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import usermanagement.dto.RequestDto;
import usermanagement.dto.ResponseDto;
import usermanagement.service.UserService;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;

public class UserManagementFrame extends JFrame {
	
	private static Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	private BufferedReader reader;
	private PrintWriter writer;
	private Gson gson;
	
	private List<JTextField> loginFields;
	private List<JTextField> registerFields;
	
	private CardLayout mainCard;
	private JPanel mainPanel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField registerNameField;
	private JTextField registerEmailField;
	private JPasswordField registerPasswordField;
	private JTextField registerUsernameField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {			
					socket = new Socket("127.0.0.1", 9090);

					UserManagementFrame frame = new UserManagementFrame();
					frame.setVisible(true);
				} catch (ConnectException e) {
					JOptionPane.showMessageDialog(null, "서버에 연결할 수 없습니다.","접속실패", JOptionPane.ERROR_MESSAGE);					
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserManagementFrame() {
		
		try {
			inputStream = socket.getInputStream();
			reader = new BufferedReader(new InputStreamReader(inputStream));
			outputStream = socket.getOutputStream();
			writer = new PrintWriter(outputStream, true);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		gson = new Gson();
		
		loginFields = new ArrayList<>();
		registerFields = new ArrayList<>();
		
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		mainPanel = new JPanel();
		mainPanel.setForeground(new Color(255, 255, 255));
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBorder(null);

		setContentPane(mainPanel);
		
		mainCard = new CardLayout(0, 0);
		mainPanel.setLayout(mainCard);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setForeground(new Color(255, 255, 255));

		
		mainPanel.add(loginPanel, "loginPanel");
		loginPanel.setLayout(null);
		
		JLabel logoText = new JLabel("User Menagement");
		logoText.setFont(new Font("CookieRun Regular", Font.BOLD, 20));
		logoText.setBounds(101, 24, 213, 54);
		loginPanel.add(logoText);
		
		JLabel loginText = new JLabel("Login");
		loginText.setFont(new Font("D2Coding", Font.BOLD, 30));
		loginText.setBounds(159, 73, 105, 48);
		loginPanel.add(loginText);
		
		usernameField = new JTextField();
		usernameField.setBounds(120, 181, 155, 38);
		loginPanel.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel usernameLabel = new JLabel("ID");
		usernameLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		usernameLabel.setBounds(68, 192, 50, 15);
		loginPanel.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("password");
		passwordLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		passwordLabel.setBounds(43, 262, 65, 15);
		loginPanel.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(120, 251, 155, 38);
		loginPanel.add(passwordField);
		
		JToggleButton loginButton = new JToggleButton("Login");
			
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			JsonObject loginUser = new JsonObject();
			loginUser.addProperty("usernameOrEmail", usernameField.getText());	
			loginUser.addProperty("password", passwordField.getText());
			
			UserService userService = UserService.getInstance();
			
			Map<String,String> response = userService.authorize(loginUser.toString());
			
			if(response.containsKey("error")) {
				JOptionPane.showMessageDialog(null, response.get("error"),"error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			JOptionPane.showMessageDialog(null, response.get("OK"),"OK", JOptionPane.INFORMATION_MESSAGE);


				
			}
		});
		
		loginButton.setBounds(287, 217, 74, 38);
		loginPanel.add(loginButton);
		
		JLabel signupDesc = new JLabel("Dong't have an account?");
		signupDesc.setFont(new Font("궁서", Font.BOLD, 12));
		signupDesc.setBounds(84, 360, 180, 32);
		loginPanel.add(signupDesc);
		
		JLabel signupLink = new JLabel("Sign up");
		signupLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "registerPanel");
				clearFields(loginFields);
			}
		});
		signupLink.setForeground(new Color(0, 128, 255));
		signupLink.setFont(new Font("굴림", Font.BOLD, 13));
		signupLink.setBounds(257, 369, 50, 15);
		loginPanel.add(signupLink);
		
		JToggleButton forgotPasswordButton = new JToggleButton("Find ID or Password");
		forgotPasswordButton.setBounds(120, 313, 155, 23);
		loginPanel.add(forgotPasswordButton);
		
		JPanel registerPanel = new JPanel();
		registerPanel.setForeground(new Color(0, 0, 0));
		registerPanel.setBackground(new Color(255, 255, 255));
		mainPanel.add(registerPanel, "registerPanel");
		registerPanel.setLayout(null);
		
		JLabel signInlink = new JLabel("Sign in");
		signInlink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "loginPanel");
				clearFields(registerFields);
			}
			
		});
		signInlink.setFont(new Font("굴림", Font.PLAIN, 15));
		signInlink.setBounds(315, 426, 132, 37);
		registerPanel.add(signInlink);
		
		JLabel registerLogoText = new JLabel("User Menagement");
		registerLogoText.setFont(new Font("CookieRun Regular", Font.BOLD, 20));
		registerLogoText.setBounds(101, 24, 213, 54);
		registerPanel.add(registerLogoText);
		
		JLabel registerText = new JLabel("Register");
		registerText.setFont(new Font("D2Coding", Font.BOLD, 30));
		registerText.setBounds(139, 73, 142, 48);
		registerPanel.add(registerText);
		
		JLabel registerUsernameLabel = new JLabel("Username");
		registerUsernameLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		registerUsernameLabel.setBounds(51, 135, 95, 15);
		registerPanel.add(registerUsernameLabel);
		
		JLabel registerPasswordLabel = new JLabel("Password");
		registerPasswordLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		registerPasswordLabel.setBounds(51, 204, 119, 15);
		registerPanel.add(registerPasswordLabel);
		
		JLabel registerNameLabel = new JLabel("name");
		registerNameLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		registerNameLabel.setBounds(50, 259, 96, 15);
		registerPanel.add(registerNameLabel);
		
		JLabel registerEmailLabel = new JLabel("email");
		registerEmailLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		registerEmailLabel.setBounds(50, 318, 96, 15);
		registerPanel.add(registerEmailLabel);
		
		registerNameField = new JTextField();
		registerNameField.setColumns(10);
		registerNameField.setBounds(52, 279, 262, 29);
		registerPanel.add(registerNameField);
		
		registerEmailField = new JTextField();
		registerEmailField.setColumns(10);
		registerEmailField.setBounds(52, 343, 262, 29);
		registerPanel.add(registerEmailField);
		
		registerPasswordField = new JPasswordField();
		registerPasswordField.setBounds(51, 220, 263, 29);
		registerPanel.add(registerPasswordField);
		
		JButton registerButton = new JButton("Register");
		
		registerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JsonObject userJson = new JsonObject();
				userJson.addProperty("username", registerUsernameField.getText());
				userJson.addProperty("password", registerPasswordField.getText());
				userJson.addProperty("name", registerNameField.getText());
				userJson.addProperty("email", registerEmailField.getText());
				
				RequestDto<String> requestDto = new RequestDto<String>("register", userJson.toString());		
				writer.println(gson.toJson(requestDto));
				writer.flush();
				
				try {
					String response = reader.readLine();
					System.out.println("응답옴");
					System.out.println(response);
					ResponseDto<?> responseDto = gson.fromJson(response, ResponseDto.class);
					
					if(responseDto.getCode().equals("error")){
						JOptionPane.showMessageDialog(null, responseDto.getBody(),responseDto.getCode(), JOptionPane.ERROR_MESSAGE);
						return;
					}
					
					JOptionPane.showMessageDialog(null, responseDto.getBody(),responseDto.getCode(),JOptionPane.INFORMATION_MESSAGE);
					mainCard.show(mainPanel, "loginPanel");
					clearFields(registerFields);
					
	
				} catch (IOException e1) {
					e1.printStackTrace();
				} 
																
			} 
		});
		registerButton.setBounds(116, 391, 142, 37);
		registerPanel.add(registerButton);
		
		registerUsernameField = new JTextField();
		registerUsernameField.setColumns(10);
		registerUsernameField.setBounds(52, 160, 262, 29);
		registerPanel.add(registerUsernameField);
		
		loginFields.add(usernameField);
		loginFields.add(passwordField);

		registerFields.add(registerUsernameField);
		registerFields.add(registerPasswordField);
		registerFields.add(registerNameField);
		registerFields.add(registerEmailField);
	}
	
	private void clearFields(List<JTextField> textFields) {
		for(JTextField field : textFields) {
			if(field.getText().isEmpty()) {
				continue;
			}
			field.setText("");
		}
		
	}
}
