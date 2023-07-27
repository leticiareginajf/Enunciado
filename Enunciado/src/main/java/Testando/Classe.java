package Testando;

import java.util.Scanner;

public class Classe {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();

        System.out.println("Seu nome é: " + nome);
    }
}
