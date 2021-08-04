//1.Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números.

import java.util.Scanner;

public class exercise1 {
  public static void main(String[] args) {
    Scanner intNumbers = new Scanner(System.in);

    System.out.print("digite o primeiro número: ");
    int a = intNumbers.nextInt();

    System.out.print("digite o segund número: ");
    int b = intNumbers.nextInt();

    System.out.print("digite o terceiro número: ");
    int c = intNumbers.nextInt();
    
    System.out.print("digite o primeiro número: ");
    int d = intNumbers.nextInt();

    intNumbers.close();

    System.out.println("a soma é : " + (a + b + c + d));
  }
}
