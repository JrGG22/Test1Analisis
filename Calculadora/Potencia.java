package Calculadora;

import java.util.Scanner;
public class Potencia {

    private Scanner scanner;

    public Potencia() {
        scanner = new Scanner(System.in);
    }

    public void realizarPotencia() {
        System.out.println("Primer numero para la base:");
        int num1 = scanner.nextInt();
        System.out.println("Segundo numero para la potencia:");
        int num2 = scanner.nextInt();
        
        double resultado = Math.pow(num1, num2);
        System.out.printf("La potencia de %d elevado a %d es: %.0f%n", num1, num2, resultado);
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
