
public abstract class Animal {
	// void makeSomeNoise() {
	// System.out.println("mmmm....");
	// }

	String name;

	Animal() {
		name = "azz";
	}

	public Animal debug() {
		System.out.println(this);
		return this;
	}

	abstract void show();

	 void d(){
		System.out.println("Dogii");
	}
	
	@Override
	public String toString() {
		return "Animal name: " + name + "\n";
	}

}
