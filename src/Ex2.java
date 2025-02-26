import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor de x1, y1 e z1: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double z1 = sc.nextDouble();
		
		System.out.println("Insira o valor de x2, y2 e z2: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double z2 = sc.nextDouble();
		
		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
		System.out.println("A distância entre os pontos é de: " + distancia);
		sc.close();
	}

}
