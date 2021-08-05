//6. Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário base e paga imposto de 7% sobre este salário.

import java.util.Scanner;

public class exercise6 {
  public static void main(String[] args) {
    Scanner wageScanner = new Scanner(System.in);
    double bonus = 0.05;
    double tax = 0.07;

    System.out.print("digite o salário do funcionário");
    double baseWage = wageScanner.nextDouble();

    double wageBeforeTax = baseWage * (1 + bonus);
    double wageAfterTax = wageBeforeTax * (1 - tax);

    wageScanner.close();

    System.out.println("o salário do funcionário após bônus e impostos é de : R$ " + wageAfterTax);

  }
}
