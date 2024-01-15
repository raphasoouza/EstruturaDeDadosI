import java.util.Scanner;

public class Recursividade5 {

    static int MDC(int x, int y) {
        if (y == 0) {
            return x;
        }

        return MDC(y, x % y);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro número:");
        int x = teclado.nextInt();
        
        System.out.print("Informe o segundo número:");
        int y = teclado.nextInt();

        int res = MDC(x, y);

        System.out.println("Resultado é:" + res);

        teclado.close();
    }
}