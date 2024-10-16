package Calculadora;

import java.util.Scanner;

public class Suma {
    private Scanner scanner;

    public Suma() {
        scanner = new Scanner(System.in);
    }

    public void realizarSuma() {
        System.out.println("Primer número para sumar:");
        int num1 = scanner.nextInt();
        System.out.println("Segundo número para sumar:");
        int num2 = scanner.nextInt();
        
        int resultado = num1 + num2;
        System.out.printf("La suma de %d y %d es: %d%n", num1, num2, resultado);
    }

    public void cerrarScanner() {
        scanner.close();
    }
}