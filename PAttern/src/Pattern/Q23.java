package Pattern;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j+i<=3 || j-i<=-5 || (j+i>=9 && j-i>=1))

				{
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
