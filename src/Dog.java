
public class Dog extends Animal {

	Dog() {
	}

	void makeSomeNoise() {
		System.out.println("bau bau");
	}
	// Animal debug() { return this; }
	// Animal debug() { return this; }
	// Object debug() { return this; }
	// int debug() { return 1; }
	// int debug(int x) { return 1; }
	// Object debug (int x) { return this; }

	@Override
	void show() {
		System.out.println("kucheto");
	}
	public static void main(String[] args){
		Dog dog = new Dog();
		Animal l = dog.debug();
		l.d();
	}

}
