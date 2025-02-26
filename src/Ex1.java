import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor de a: ");
		double a = sc.nextDouble();
		System.out.println("Insira o valor de b: ");
		double b = sc.nextDouble();
		System.out.println("Insira o valor de c: ");
		double c = sc.nextDouble();
		
		double delta = (b * b) - (4 * a * c);
		
		if(delta < 0) {
			System.out.println("Não possui valor real");
		}else {
			double r1 = (-b - Math.sqrt(delta)) / (2 * a);
			double r2 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("Os valores das raízes são: " + r1 + " e " + r2);
		}
		sc.close();
		
	}

}
