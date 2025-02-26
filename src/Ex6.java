import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int qnt;
		if(num == 0) {
			qnt = 1;
		}else {
			qnt = (int) (Math.log10(Math.abs(num)) + 1);
		}
		System.out.println("O numero tem " + qnt + " de dígitos");
		sc.close();
	}

}
