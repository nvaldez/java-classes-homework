import java.util.StringJoiner;

public class Pet {
	
	private String name;
	private int age;
	private String location;
	private String type;
	
	public Pet() {
		
	}
	
	public Pet(String name, int age, String location, String type) {
		
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

}
