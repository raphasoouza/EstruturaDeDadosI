import java.util.Random;

public class AnaliseAssintotica2 {

    static boolean Existe(int[] vet, int num, int inicio, int fim) {

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (num == vet[meio])
                return true;
            if (num < vet[meio])
                fim = meio - 1;
            else
                inicio = meio + 1;
        }
        return false;
    }

    public static void main(String[] args) {

        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random random = new Random();
        int num = random.nextInt(30);
        int inicio = 0;
        int fim = vetor.length - 1;
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("");
        System.out.println("Número é: " + num);

        System.out.println("Este número está no vetor? " + Existe(vetor, num, inicio, fim));
    }
}
