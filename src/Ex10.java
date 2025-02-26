import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o investimento mensal: ");
        double invst = sc.nextDouble();
        
        System.out.println("Insira os juros mensais (%): ");
        double juros = sc.nextDouble();
        
        String resp = "S";
        int ano = 1;
        double total = 0;

        while (resp.equalsIgnoreCase("S")) { // Agora considera "s" ou "S"
            total = calcInvest(invst, juros, total);
            System.out.printf("Saldo do investimento após %d ano(s): %.2f%n", ano, total);
            
            System.out.println("Deseja processar mais um ano? (S/N)");
            resp = sc.next();
            ano++;
        }

        sc.close();
    }

    public static double calcInvest(double invst, double juros, double saldo) {
        juros = juros / 100; 
        
        for (int i = 0; i < 12; i++) { 
            saldo = (saldo + invst) * (1 + juros);
        }

        return saldo;
    }
}
