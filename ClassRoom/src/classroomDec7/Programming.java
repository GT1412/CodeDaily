package classroomDec7;

public class Programming {
	Programming() {
		System.out.println("I want to learn  Language ");
	}

	Programming(String string) {
		System.out.println("I want to learn  " + string);
	}

	public static void main(String[] args) {
		new Programming();
		new Programming("Java ");
	}

}
