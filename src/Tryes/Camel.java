package Tryes;

public class Camel implements IFace {
	int weight = 2;

//	public static void main(String[] args) {
//		new Camel().go(8);
//	}

	void go(int speed) {
		++speed;
		weight++;
		int walkrate = speed * weight;
		System.out.print(walkrate + getGait());
	}

	@Override
	public String getGait() {
		return " mph, lope";
	}

}

class MyStuff {
	private String name;

	MyStuff(String n) {
		name = n;
	}

	public static void main(String[] args) {
		MyStuff m1 = new MyStuff("guitar");
		MyStuff m2 = new MyStuff("guitar");
		System.out.println(m2.equals(m1));
		System.out.println("sad");
	}

//	public boolean equals(Object o) {
//		MyStuff m = (MyStuff) o;
//		if (m.name == o.name) {
//			return true;
//		}
//		return false;
//	}
}
