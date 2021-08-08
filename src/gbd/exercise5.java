package gbd;
//5.Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário.

import java.util.Scanner;

public class exercise5 {
  public static void main(String[] args) {
    Scanner wageScanner = new Scanner(System.in);

    System.out.print("digite o salário do funcionário: ");
    double wage = wageScanner.nextDouble();

    System.out.print("digite o percentual do aumento (ex: se o aumento for de 4.8%, digite 4.8): ");
    double wageIncreaseIndex = wageScanner.nextDouble();

    wageScanner.close();

    System.out.println("O novo salário do funcionário é: " + wage * (wageIncreaseIndex/100 + 1));
  }
}
