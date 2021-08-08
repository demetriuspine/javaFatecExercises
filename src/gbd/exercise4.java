package gbd;
//4.Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.

import java.util.Scanner;

public class exercise4 {
  public static void main(String[] args) {
    Scanner wageScanner = new Scanner(System.in);
    double wageIncreaseIndex = 1.25;

    System.out.print("digite o salário do funcionário: ");
    double wage = wageScanner.nextDouble();

    wageScanner.close();

    System.out.println("O novo salário do funcionário é: " + wage * wageIncreaseIndex);
  }
}
