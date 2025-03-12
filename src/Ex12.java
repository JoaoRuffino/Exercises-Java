import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        String tab[][] = new String[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Insira a posição " + i + " " + j + " : ");
                tab[i][j] = sc.next();
            }
        }

        int[] jogada = melhorJogada(tab, "X");
        if (jogada == null) {
            jogada = melhorJogada(tab, "O");
        }

        if (jogada != null) {
            System.out.println("Jogue na posição: " + jogada[0] + ", " + jogada[1]);
        } else {
            System.out.println("Nenhuma jogada decisiva encontrada.");
        }

        sc.close();
    }

    public static boolean verificaVitoria(String[][] tabuleiro, String jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0].equals(jogador) && tabuleiro[i][1].equals(jogador) && tabuleiro[i][2].equals(jogador)) return true;
            if (tabuleiro[0][i].equals(jogador) && tabuleiro[1][i].equals(jogador) && tabuleiro[2][i].equals(jogador)) return true;
        }
        if (tabuleiro[0][0].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][2].equals(jogador)) return true;
        if (tabuleiro[0][2].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][0].equals(jogador)) return true;
        return false;
    }

    private static int[] melhorJogada(String[][] tabuleiro, String jogador) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j].equals("-")) {
                    tabuleiro[i][j] = jogador;
                    if (verificaVitoria(tabuleiro, jogador)) {
                        tabuleiro[i][j] = "-";
                        return new int[]{i, j};
                    }
                    tabuleiro[i][j] = "-";
                }
            }
        }
        return null;
    }
}
