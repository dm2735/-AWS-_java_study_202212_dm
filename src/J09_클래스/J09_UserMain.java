package J09_클래스;

public class J09_UserMain {

	public static void main(String[] args) {
		J09_User dongmin = new J09_User();
		J09_User Junil = new J09_User();
		
		dongmin.username = "quseis";
		dongmin.password = "ehdals2735";
		dongmin.name = "김동민";
		dongmin.email = "quseis@naver.com";
		
		Junil.username = "skjil1218";
		Junil.password = "wnsdlfwnsdlf";
		Junil.name = "김준일";
		Junil.email = "skjil1218@kakao.com";
		
		dongmin.printUserInfo();
		System.out.println();
		Junil.printUserInfo();
		
		
	}

}
