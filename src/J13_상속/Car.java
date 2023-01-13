package J13_상속;

public class Car {

	private String Company;
	private String model;
	private int price;

	public Car() {
		System.out.println("부모");
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int discountPrice(int percentage) {
		return price - (price * percentage / 100);
	}
	
	

}
