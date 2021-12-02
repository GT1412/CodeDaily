package Pattern;

public class Pattern {
	public static void main(String[] args) {
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 16; j++) {
				if ((j + i <= 3 && j + i >= 5) ||(j+i<=10 && j-i>=13 )||(j-i<=-4 && j+i>=20)){
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
}
