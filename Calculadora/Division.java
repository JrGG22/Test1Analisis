package Calculadora;

import java.util.Scanner;

public class Division {
    private Scanner scanner;

    public Division() {
        scanner = new Scanner(System.in);
    }

    public void realizarDivision() {
        System.out.println("Primer numero para dividir:");
        int num1 = scanner.nextInt();
        System.out.println("Segundo numero para dividir:");
        int num2 = scanner.nextInt();
        
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            double resultado = (double) num1 / num2;
            System.out.printf("La división de %d y %d es: %.2f%n", num1, num2, resultado);
        }
    }

    public void cerrarScanner() {
        scanner.close();
    }
}