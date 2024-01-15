import java.util.Scanner;

public class Recursividade3 {

    static boolean Primo(int num) {
        if (num <= 1) {
            return false;
        }
        return Fun(num, 2);
    }

    static boolean Fun(int num, int div) {
        if (div * div > num) {
            return true;
        }
        if (num % div == 0) {
            return false;
        }
        return Fun(num, div + 1);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = teclado.nextInt();

        boolean res = Primo(num);
        
        if (res) {
            System.out.println("Número é primo!");
        } else {
            System.out.println("Número não é primo!");
        }
        teclado.close();
    }

}
