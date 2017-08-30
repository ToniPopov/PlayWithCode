
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

	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal l = dog.debug();
		dog.makeSomeNoise();
		l.d();
		l.name = "asd";
		l.d();

		// The moethod d() from type Animal is not visible
		// dog.d();

	}

	abstract void show();

	private void d() {
		System.out.println("Dogii");
	}

	@Override
	public String toString() {
		return "Animal name: " + name + "\n";
	}

}
