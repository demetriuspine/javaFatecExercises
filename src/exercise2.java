//2.Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.

import java.util.Scanner;

public class exercise2 {
  public static void main(String[] args) {
    Scanner doubleGrades = new Scanner(System.in);

    System.out.print("digite a primeira nota: ");
    double a = doubleGrades.nextDouble();

    System.out.print("digite a segunda nota: ");
    double b = doubleGrades.nextDouble();

    System.out.print("digite a terceira nota: ");
    double c = doubleGrades.nextDouble();

    doubleGrades.close();

    System.out.println("a média é : " + ((a + b + c)/3));
  }
}