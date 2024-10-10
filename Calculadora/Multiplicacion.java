package Calculadora;

import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer numero para multiplicar:");
        int num1 = scanner.nextInt();
        System.out.println("Segundo numero para multiplicar:");
        int num2 = scanner.nextInt();
        
        int resultado = num1 * num2;
        
        System.out.printf("La multiplicación de %d y %d es: %d%n", num1, num2, resultado);
        scanner.close();
    }
}
