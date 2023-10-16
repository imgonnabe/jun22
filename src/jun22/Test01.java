package jun22;

class SuperObject {
	public void paint() {
		SubObject.draw();
	}

	public void draw() {
		SubObject.draw();
		System.out.println("Super Object");
	}
}

class SubObject {
	public void paint() {
		draw();
	}

	public static void draw() {
		System.out.println("Sub Object");
	}
}

public class Test01 {
	public static void main(String[] args) {
		SuperObject a = new SuperObject();
		a.paint();
	}

}
