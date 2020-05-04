
public class phoneClass {
	
	private String name;
	private String brand;
	private String model;
	private boolean hasWarranty;
	
	public phoneClass() {
		
	}
	
	public phoneClass(String name, String brand) {
		
		this.name = name;
		this.brand = brand;
	}

	public phoneClass(String name, String brand, String model){

		this.name = name;
		this.brand = brand;
		this.model = model;
	}

}
