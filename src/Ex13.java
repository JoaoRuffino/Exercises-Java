import java.util.Arrays;
import java.util.Random;

public class Ex13 {

	public static void main(String[] args) {
		int[] vetor = new int[100];
		Random random = new Random();
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(100);
			System.out.print(vetor[i] + " ");
		}
		Arrays.sort(vetor);
		System.out.println("");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
	
	

}
