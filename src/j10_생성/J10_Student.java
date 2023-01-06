package j10_생성;

public class J10_Student {
	     // 참조변수 or 레퍼런스변수 or 멤버변수 로 부른다.
	public int age;  //public : 접근 제한 없음 (default 값 = 동일 패키지 안에서만 접근제한 없음)
	   String name;	 //

	J10_Student() {
		System.out.println("기본 생성자 호출");
	}

	J10_Student(int age) {
		System.out.println("나이 : " + age);
	}
	
	J10_Student(String name){
		System.out.println("이름 : " + name);
	}
	
	J10_Student(String name, int age){
		this.name  = name;             //멤버변수에 지역변수 값을 대입한다.
		this.age = age;
		System.out.println("이름 : " + name + " 나이 :" + age);
	}
	
	void printInfo() { //멤버변수 출력
		System.out.println("학생 이름: " + name);
		System.out.println("학생 나이: " + age);
	}

}
