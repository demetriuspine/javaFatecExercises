//Faça um programa que receba o valor de um depósito e o valor da taxa de juros, calcule e mostre o valor do rendimento e o valor total depois do rendimento.

import java.util.Scanner;

public class exercise8 {
  public static void main(String[] args) {
    Scanner generalScanner = new Scanner(System.in);
    
    System.out.print("Digite o valor do depósito: ");
    double PV = generalScanner.nextDouble();

    System.out.print("Digite o valor da taxa percentual mensal (ex: se a taxa for 5,54% digite 5.54): ");
    double i = generalScanner.nextDouble();

    System.out.print("Digite o o período do investimento, em meses: ");
    int n = generalScanner.nextInt();

    double powerValue = Math.pow((1+(i/100)), n);

    double FV = PV * powerValue;

    generalScanner.close();

    System.out.println("O valor do rendimento é de: " + (FV - PV) + " e o valor total após o rendimento é de :" + FV);
  }
}
