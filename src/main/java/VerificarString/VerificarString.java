package VerificarString;

import java.util.Scanner;

public class VerificarString {

    public static int encontrarA(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();

        int ocorrencias = encontrarA(texto);

        System.out.println("A letra 'a' ocorre " + ocorrencias + " vezes na string.");

        scanner.close();
    }
}
