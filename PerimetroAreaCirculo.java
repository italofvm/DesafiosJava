package DesafiosJava;

import java.util.Scanner;

public class PerimetroAreaCirculo {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double raio;
    double pi = 3.14;

    //entrada de dados
    System.out.println("Digite o valor do raio do círculo: ");
    raio = entrada.nextDouble();
    
    //cálculo
    double perimetro = 2 * pi * raio;
    double area = pi * raio * raio;

    //Resultado
    System.out.println("O perímetro do círculo é " + perimetro);
    System.out.println("A área do círculo é " + area);
  }
}
