package Calculadora;

import java.util.Scanner;

public class Residuo {
    private Scanner scanner;

    public Residuo() {
        scanner = new Scanner(System.in);
    }
    public void realizarResiduo() {
        System.out.println("Primer numero para hacer residuo:");
        int num1 = scanner.nextInt();
        System.out.println("Segundo numero para hacer residuo:");
        int num2 = scanner.nextInt();
        
        if (num2 == 0) {
            System.out.println("Error: No se puede calcular el residuo con divisor cero.");
        } else {
            int resultado = num1 % num2;
            System.out.printf("El residuo de %d y %d es: %d%n", num1, num2, resultado);
        }
    }
    public void cerrarScanner() {
        scanner.close();
    }
}
