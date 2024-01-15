import java.util.Scanner;

public class Recursividade2 {

    static int Potencia(int exp) {
        if (exp == 0) {
            return 1;
        }

        return 2 * Potencia(exp - 1);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o expoente: ");
        int exp = teclado.nextInt();

        int res = Potencia(exp);
        System.out.println("Resultado: "+ res);

        teclado.close();
    }



}
