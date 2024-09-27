package Prueba;

import java.util.Scanner;

public class Resta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer numero para restar:");
        int num1 = scanner.nextInt();
        System.out.println("Segundo numero para restar:");
        int num2 = scanner.nextInt();
        int resultado = num1 - num2;
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resultado);
        scanner.close();
    }
}