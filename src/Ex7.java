import java.util.Scanner;

public class Ex7 {
//a)
// A solução correta é a letra A
//b) Segue abaixo o código corrigido da B
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo;

        do {
            System.out.print("Informe o código: ");
            codigo = teclado.nextInt();
            
            if (codigo != -1) {
                System.out.println("Código: " + codigo);
            }
        } while (codigo != -1);

        teclado.close();
    }
}
