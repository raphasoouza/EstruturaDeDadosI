import java.util.Scanner;

public class Recursividade1 {

    static long fatorial(int x) {
        int n = 1;
        for (int i = 1; i <= x; i++) {
            n *= i;
        }
        return n;
    }

    static long fibonacci(int x) {
        if (x <= 1) {
            return x;
        }
        
        int y = 0;
        int z = 1;
        int res = 0;

        for (int i = 2; i <= x; i++) {
            res = y + z;
            y = z;
            z = res;
            System.out.println(res + " ");
        }
         
        return res;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x, escolha = 0; 

        while (escolha != 1 && escolha != 2) { 
            System.out.println("1 - Fatorial");
            System.out.println("2 - Fibonacci");
            escolha = teclado.nextInt();
        }

        System.out.print("Digite um número: ");
        x = teclado.nextInt();

        if (escolha == 1)
            System.out.println("Fatorial: " + fatorial(x));
        else
            System.out.println("Fibonacci: " + fibonacci(x));

        teclado.close();
    }
}
