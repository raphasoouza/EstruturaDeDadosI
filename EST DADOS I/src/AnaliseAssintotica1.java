import java.util.Scanner;
import java.util.Random;

public class AnaliseAssintotica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int vetor[];
        Random aleatorio = new Random();

        System.out.print("Informe o tamanho do vetor: ");
        n = scanner.nextInt();
        vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(100); 
        }

        int menor = vetor[0];
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);

        scanner.close();
    }
}


// Complexidade: Linear, visto que, cresce conforme o tamanho do vetor dado pelo o usuário