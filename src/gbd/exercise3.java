package gbd;
//3.Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.

import java.util.Scanner;

public class exercise3 {
  public static void main(String[] args) {
    Scanner doubleGrades = new Scanner(System.in);

    System.out.print("digite a primeira nota: ");
    double a = doubleGrades.nextDouble();

    System.out.print("digite a segunda nota: ");
    double b = doubleGrades.nextDouble();

    System.out.print("digite a terceira nota: ");
    double c = doubleGrades.nextDouble();

    doubleGrades.close();

    int peso1 = 5;
    int peso2 = 3;
    int peso3 = 2;


    System.out.println("a média é : " + (((a * peso1) + (b * peso2) + (c * peso3))/(peso1 + peso2 + peso3)));
  }
}