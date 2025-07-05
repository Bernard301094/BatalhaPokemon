package main.java.br.com.pokemonbattle.utils;

public class ScannerUtils {
    public String lerTexto() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }

    public int lerInteiro() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numero = scanner.nextInt();
        return numero;
    }
}
