
/*
2, 2, 1
2, 3, 1
2, 3, 3
2, 4, 1
2, 4, 3
4, 4, 1
*/
public class Ex9 {
	public static void main(String[] args) {
		for (int i = 2; i <= 8; i = i + 2) {
			for (int j = i; j <= 4; j++) {
				for (int k = 1; k <= j; k = k + i) {
					System.out.println(i + ", " + j + ", " + k);
				}
			}
		}
	}
}