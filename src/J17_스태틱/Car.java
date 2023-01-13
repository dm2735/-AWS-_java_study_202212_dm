package J17_스태틱;

import java.time.LocalDateTime;

public class Car {
	
	//강사님 코드
	
	private static final int NOW_YEAR = LocalDateTime.now().getYear();
	
	private static final String Code = "KIA-"+NOW_YEAR+ "-";
	private static int ai=1;
	
	private String serialCode;
	private String ModelName;
	
	public Car(String ModelName) {
		serialCode = Code + String.format("%04d",ai);
		this.ModelName = ModelName;
		ai++;
		
	}

	@Override
	public String toString() {
		return "Car [Code=" + Code + ", serialCode=" + serialCode + ", ModelName=" + ModelName + "]";
	}
	
	
	
	
	
	/*
	private static String Code = "KIA-2023-";  //KIA-2023-0000
	private static int ai = 1 ;
	
	private  String serialcode ;
	private  String modelName ;
	
	
	public Car(String modelName) {
		
		serialcode = Code + ai;
		ai++;
		this.modelName = modelName;		
		
	}



	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", serialcode=" + serialcode  + "]";
	}
	*/
	
	

}
