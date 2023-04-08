// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

import java.lang.Math;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Informe o número do raio do círculo: ");
    Scanner teclado = new Scanner(System.in);
    double numeroRaio = teclado.nextDouble();

    double areaDoCirculo = Math.PI * Math.pow(numeroRaio, 2);

    System.out.println("A área do círculo com base no raio informado é: " + areaDoCirculo);

  }
}