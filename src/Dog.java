
public class Dog extends Animal {

	Dog() {
	}

	void makeSomeNoise() {
		System.out.println("bau bau");
	}

	@Override
	void show() {
		System.out.println("kucheto");
	}
	public static void main(String[] args){
		Dog dog = new Dog();
		Animal l = dog.debug();
		dog.makeSomeNoise();
		l.d();
		l.name = "asd";
	}

}
