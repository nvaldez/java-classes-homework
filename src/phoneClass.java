
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

	public String getName(){
		return this.name;
	}

	public String getBrand(){
		return this.brand;
	}

	public String getModel(){
		return this.model;
	}
	 public boolean getHasWarranty(){
		return this.hasWarranty;
	 }

	public void setName(String name) {
		this.name = name;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setHasWarranty(boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}
}
