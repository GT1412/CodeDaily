package Pattern;

public class Q5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				if ((j + i <= 4) || (j - i <= -4)) {
					System.out.print("*");
				}
				System.out.print("");
			}
			System.out.println();
		}
	}
}
