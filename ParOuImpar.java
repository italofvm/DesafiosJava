package DesafiosJava;

import java.util.Scanner;

public class ParOuImpar {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    //variaveis.
    int num;

    //entrada de dados.
    System.out.println("Digite um número inteiro: ");
    num = entrada.nextInt();

    //verificando se é par ou ímpar.
    if(num % 2 == 0){
      System.out.println(num + " é um número par.");
    }else{
      System.out.println(num + " é um número ímpar.");
    }
  }
}
