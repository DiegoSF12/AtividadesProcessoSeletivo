package FibonacciCheck;
import java.util.Scanner;

public class FibonacciCheck {

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        while (a < num) {
            int next = a + b;
            a = b;
            b = next;
        }
        return a == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
