import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número inteiro: ");
		int num = sc.nextInt();
		int ant2 = 0;
		int ant = 1;
		int atual;
		System.out.print(ant2 + ", " + ant);
		for(int i = 1; i < num; i++) {
			atual = ant + ant2;
			System.out.print(", " + atual);
			ant2 = ant;
			ant = atual;
		}
		sc.close();

	}

}
