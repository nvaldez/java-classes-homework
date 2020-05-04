
public class ClassesHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Testing the pet class
		Pet pet = new Pet("Redondo", 1, "Gretna", "Dog");
		
		System.out.println("Pet name is: " + pet.getName());
		System.out.println("Pet age is: " + pet.getAge());
		System.out.println("Pet type is: " + pet.getType());
		System.out.println("Pet location is: " +pet.getLocation());
		
		System.out.println();
		System.out.println("updated pet information\n");
		
		
		pet.setName("Jadiel");
		pet.setAge(8);
		pet.setLocation("NOLA");
		pet.setType("Cat");
		
		System.out.println("Pet name is: " + pet.getName());
		System.out.println("Pet age is: " + pet.getAge());
		System.out.println("Pet type is: " + pet.getType());
		System.out.println("Pet location is: " +pet.getLocation());
		
	}

}
