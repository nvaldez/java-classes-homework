
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

		// Testing the phone class
		Phone phone = new Phone("Iphone", "Apple", "Iphone 11");

		System.out.println();
		System.out.println("Original phone");
		System.out.println("Phone name: " + phone.getName());
		System.out.println("Phone brand: " + phone.getBrand());
		System.out.println("Phone model: " + phone.getModel());
		System.out.println("Warranty: " + phone.getHasWarranty());

		System.out.println();

		phone.setName("Galaxy");
		phone.setBrand("Samsung");
		phone.setModel("Note 10");
		phone.setHasWarranty(true);

		System.out.println("Updated phone");
		System.out.println();

		System.out.println("Phone name: " + phone.getName());
		System.out.println("Phone brand: " + phone.getBrand());
		System.out.println("Phone model: " + phone.getModel());
		System.out.println("Warranty: " + phone.getHasWarranty());

	}

}
