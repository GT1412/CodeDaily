package Pattern;

public class Q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if ((j - i <= 0) && (j + i <= 8)) {
					System.out.print((char) (j+65));
				}
				System.out.print(" ");
			}
			System.out.println();

		}
	}
}
