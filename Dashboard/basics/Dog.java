package basics;

public class Dog {
	
	String name;
	String says;
	
	public Dog() {
		
	}
	
	public Dog (String name, String says) {
		this.name = name;
		this.says = says;
	}

	public static void main(String[] args) {
		Dog spot = new Dog("Spot", "Ruff!");
		Dog scruffy = new Dog("Scruffy", "Wurf!");
		
		Dog dog3 = new Dog();
		
		dog3 = spot;
		
//		System.out.println(spot.name + " says " + spot.says);
//		System.out.println(scruffy.name + " says " + scruffy.says);
		
		System.out.println("spot: " + spot);
		System.out.println("scruffy: " + scruffy);
		System.out.println(spot==scruffy);
		System.out.println(spot.equals(scruffy));
		
		spot = scruffy;
		
		System.out.println("spot: " + spot);
		System.out.println("scruffy: " + scruffy);
		System.out.println(spot==scruffy);
		System.out.println(spot.equals(scruffy));

//		System.out.println("dog3: " + dog3);
//		System.out.println("dog3.name: " + dog3.name + " dog3.says: " + dog3.says);
//		
//		System.out.println("dog3==spot:");
//		System.out.println(dog3==spot);
//		
//		System.out.println("dog3.equals(spot):");
//		System.out.println(dog3.equals(spot));
//		
//		System.out.println("spot: " + spot);
	}

}
