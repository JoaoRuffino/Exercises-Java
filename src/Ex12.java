import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		String tab[][] = new String[3][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Insira a posição " + i + " " + j + " : ");
				tab[i][j] = sc.next();
			}
	}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
				
			}
			System.out.println("");
	}
		sc.close();

}
	
	public static boolean verificaVitoria(String[][] tabuleiro, String jogador) {
		for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) return true;
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) return true;
        }
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) return true;
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) return true;
        return false;
	}
}
