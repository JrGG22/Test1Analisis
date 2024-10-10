package Calculadora;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();
    }
}