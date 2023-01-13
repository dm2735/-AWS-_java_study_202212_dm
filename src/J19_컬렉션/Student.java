package J19_컬렉션;


// Ctrl  + Shift + O   = 필요없는 거 정리
import lombok.AllArgsConstructor;
import lombok.Data;

// @NoArgsConstructor //기본 생성자
// @RequiredArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString

@AllArgsConstructor //전체 생성자
@Data //Getter, Setter, EqualsAndHashCode, ToString

public class Student {
	private  String name;
	private  int year; //학년
//	private final String address;
}
