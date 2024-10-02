package Calculadora;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer numero para hacer modulo:");
        int num1 = scanner.nextInt();
        System.out.println("Segundo numero para hacer modulo:");
        int num2 = scanner.nextInt();
        int resultado = num1 % num2;
        System.out.println("el modulo de " + num1 + " y " + num2 + " es: " + resultado);
        scanner.close();
    }
}
