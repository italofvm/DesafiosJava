package DesafiosJava;

import java.util.Scanner;

public class AntecessorSucessor {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int num;

    System.out.println("Digite um número inteiro: ");
    num = entrada.nextInt();

    System.out.println("O antecessor de " + num + " é " + (num-1));
    System.out.println("O sucessor de " + num + " é " + (num+1));
  }
}
