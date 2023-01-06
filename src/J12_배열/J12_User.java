package J12_배열;


//Entity 클래스 - 정보를 담는 클래스
//서비스 클래스 - 기능을 담는 클래스
public class J12_User {
	private String username; // = ID
	private String password; // 비밀번호
	private String name;	//이름
	private String email;	//이메일
	
	public J12_User() {}// ctrl + space

	
	//alt + shift + s -> constructor using field
	public J12_User(String username, String password, String name, String email) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	//alt + shift + s -> getter setter
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "J12_User [username=" + username + ", password=" + password + ", name=" + name + ", email=" + email
				+ "]";
	} 
	
	
	
		
	
	
	
	
		

	}


