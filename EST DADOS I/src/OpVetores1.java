import java.util.Random;

public class OpVetores1 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(50);
        }

        System.out.println("Vetor Preenchido:");
        for (int x : vetor) {
            System.out.print(x + " ");
        }

        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                vetor[cont] = vetor[i];
                cont++;
            }
        }

        System.out.println("\nVetor Alterado:");
        for (int i = 0; i < cont; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
