package DesafiosJava;

import java.util.Scanner;

public class MediaAritmetica {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int num1;
    int num2;
    int num3;
    double media;

    System.out.println("Digite o primeiro número: ");
    num1 = entrada.nextInt();

    System.out.println("Digite o primeiro número: ");
    num2 = entrada.nextInt();

    System.out.println("Digite o primeiro número: ");
    num3 = entrada.nextInt();

    media = (num1 + num2 + num3) / 3.0;

    System.out.println("A média aritmética é " + media);
  }
}