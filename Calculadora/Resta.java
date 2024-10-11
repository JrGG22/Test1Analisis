package Calculadora;

import java.util.Scanner;

public class Resta {
    private Scanner scanner;

    public Resta() {
        scanner = new Scanner(System.in);
    }
    public void realizarResta() {
        System.out.println("Primer numero para restar:");
        int num1 = scanner.nextInt();
        System.out.println("Segundo numero para restar:");
        int num2 = scanner.nextInt();
        
        int resultado = num1 - num2;
        System.out.printf("La resta de %d y %d es: %d%n", num1, num2, resultado);
    }
    public void cerrarScanner() {
        scanner.close();
    }
}