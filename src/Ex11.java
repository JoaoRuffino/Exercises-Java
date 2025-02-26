import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        System.out.print("Digite o erro máximo permitido: ");
        double erroMax = sc.nextDouble();

        double raiz = calcularRaiz(numero, erroMax);

        System.out.printf("A raiz quadrada aproximada de %d é %.6f%n", numero, raiz);

        sc.close();
    }

    public static double calcularRaiz(int num, double erro) {
        double chute = num / 2.0; // Chute inicial
        double novaAprox;

        do {
            novaAprox = (chute + num / chute) / 2.0;
            if (Math.abs(novaAprox - chute) < erro) {
                break;
            }
            chute = novaAprox;
        } while (true);

        return novaAprox;
    }
}
