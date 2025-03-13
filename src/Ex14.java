import java.util.Arrays;
import java.util.Random;

public class Ex14 {

	public static void main(String[] args) {
		int[] vet1 = new int[50];
		int[] vet2 = new int[50];
		int[] vet3 = new int[100];
		Random random = new Random();
		for(int i = 0; i < vet1.length; i++) {
			vet1[i] = random.nextInt(100);
			vet2[i] = random.nextInt(100);
		}
		Arrays.sort(vet1);
		Arrays.sort(vet2);
		int i = 0, j = 0, k = 0;
        while (i < 50 && j < 50) {
            if (vet1[i] <= vet2[j]) {
                vet3[k] = vet1[i];
                k++;
                i++;
            } else {
                vet3[k] = vet2[j];
                k++;
                j++;
            }
        }

        while (i < 50) {
            vet3[k++] = vet1[i++];
        }

        while (j < 50) {
            vet3[k++] = vet2[j++];
        }
		for(i = 0; i < vet3.length; i++) {
			System.out.print(vet3[i] + " ");
		}
		
	}

}
