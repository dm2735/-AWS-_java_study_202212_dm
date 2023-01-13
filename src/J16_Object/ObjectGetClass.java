package J16_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class ObjectGetClass {
	public static void main(String[] args) {
		Student student = new Student("김재영", 29);
		
		System.out.println(student.getClass()); // Student 정보를 출력
		System.out.println(Student.class);  // class Class 정보를 출력
		
		System.out.println(student.getClass().getName());
		
		Class studentClass = student.getClass();
		
		String className = studentClass.getName();
		System.out.println(className);
		
		String simpleName = studentClass.getSimpleName();
		System.out.println(simpleName);
		
		Field[] fields = studentClass.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		
		Method[] methods = studentClass.getDeclaredMethods();
			for(Method method : methods) {
				System.out.println(method);
		}
		
	}
}
