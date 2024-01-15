import java.util.Scanner;

public class Recursividade4 {

    static int Multi(int x, int y) {
        if (y == 0) {
            return 0;
        }
        if (y == 1) {
            return x;
        }
        return x + Multi(x, y-1);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int x = teclado.nextInt();
        
        System.out.print("Informe o segundo número: ");
        int y = teclado.nextInt();

        int resultado = Multi(x, y);
        System.out.println("Resultado: " + resultado);

        teclado.close();
    }

}
