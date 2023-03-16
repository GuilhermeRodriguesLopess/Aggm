package aGithubexerc;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        int va1, va2, soma;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        va1 = ler.nextInt();
        System.out.println("Digite outro valor: ");
        va2 = ler.nextInt();
        soma = (va1 + va2);
        System.out.println("a soma é:"+soma);
    }
}