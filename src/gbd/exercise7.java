package gbd;
//Faça um programa que receba o salário base de um funcionário, calcule e mostre o seu salário a receber, sabendo-se que o funcionário tem gratificação de R$ 50 e paga imposto de 10% sobre o salário base.

import java.util.Scanner;

public class exercise7 {
  public static void main(String[] args) {
    Scanner wageScanner = new Scanner(System.in);
    int grat = 50;
    double tax = 0.1;

    System.out.print("Digite o salário base do funcionário: ");
    double wage = wageScanner.nextDouble();

    double finalWage = (wage * (1 - tax)) + grat;

    wageScanner.close();

    System.out.println("o salário a a pagar será de :" + finalWage);
  }
}
