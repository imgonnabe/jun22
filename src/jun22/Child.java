package jun22;

class Parent {
	public void parentMethod() {
		System.out.println("나는 부모다");
		childhood();
	}
	
	public void childhood() {
		System.out.println("부모-어린시절");
	}
}

public class Child extends Parent {
	public void parentMethod() {
		System.out.println("나는 자식이다.");
		super.parentMethod();
	}
	
	public void childhood() {
		System.out.println("자식-어린시절");
	}

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.parentMethod();
		//((Child) parent).childMethod();

	}

}
