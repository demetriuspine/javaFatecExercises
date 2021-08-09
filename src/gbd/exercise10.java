package gbd;

//Faça um programa que calcule e mostre a área de um círculo. Sabe-se que: Área = π * r2.

import java.util.Scanner;

public class exercise10 {
  public static void main(String[] args) {
    Scanner radiusScanner = new Scanner(System.in);
    double pi = 3.14;

    System.out.print("Digite o valor do raio do círculo: ");
    double radius = radiusScanner.nextDouble();
    double circleArea = pi * radius * radius;

    radiusScanner.close();

    System.out.println("O valor da área do círculo é de :" + circleArea);
  }
}
