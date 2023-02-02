package J24_람다;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lamda3연습 {
	
	public static void main(String[] args) {
		
		//1. Runnable - run()
		
		Runnable a = () -> System.out.println("실행");
		Runnable b = () -> {
			System.out.println("여러명 실행");
			System.out.println("여러명 실행");
			System.out.println("여러명 실행");
			System.out.println("여러명 실행");
			System.out.println("여러명 실행");
			System.out.println("여러명 실행");
		};
		a.run();
		b.run();
		
		//2. Supplier<T> - get()
		
		Supplier<String> c = () -> "김동민";
		
		Supplier<LocalDate> d = () -> LocalDate.now();
		
		Supplier<String> e = () ->{
			LocalDate now = LocalDate.now();
			return now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
		};
		
		System.out.println(c.get());
		System.out.println(e.get());
		
		
		//3. Consumer <T> - void accept(T t)
		Consumer<String> f = name -> {
			System.out.println("이름을 출력합니다.");
			System.out.println("이름 : " + name);
		};
		
		f.accept("김동민");
		
		List<String> names = new ArrayList<>();
		names.add("김동민");
		names.add("김민수");
		
		Consumer<String> g = name -> {
			System.out.println("이름 : "+ name);
		};
		
		names.forEach(g);
		
		names.forEach(name -> {
			System.out.println("이름을 출력합니다");
			System.out.println(name);
					
		});
				
		
	}
}
