package gbd;
import java.util.Scanner;

public class exercise9 {
  public static void main(String[] args) {
    Scanner trianglScanner = new Scanner(System.in);

    System.out.print("Digite o valor da base do triângulo: ");
    double base = trianglScanner.nextDouble();
    
    System.out.print("Digite o valor da altura do triângulo: ");
    double height = trianglScanner.nextDouble();
    
    double area = (base * height)/2;

    trianglScanner.close();

    System.out.println("o valor da área do triângulo é de: " + area);
  }
}
