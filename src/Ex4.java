import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o nome do produto: ");
		String nome = sc.next();
		System.out.println("Insira o preço do produto: ");
		double preco = sc.nextDouble();
		System.out.println("Insira a quantidade do produto: ");
		int quantidade = sc.nextInt();
		double total = preco * quantidade;
		double desc = 0;
		if(quantidade < 10) {
		}else if(quantidade > 10 && quantidade <= 20) {
			desc = total * (10.0/100);
		}else if(quantidade > 20 && quantidade <= 50){
			desc = total * (20.0/100);
		}else if (quantidade > 50) {
			desc = total * (25.0/100);
		}else {
			System.out.println("Valor não válido");
			sc.close();
			System.exit(0);
		}
		total = total - desc;
		System.out.println("============ NOTA FISCAL ==========");
		System.out.println("Produto: " + nome);
		System.out.println("Valor a ser pago: " + total);
		sc.close();
		
		
	}

}
