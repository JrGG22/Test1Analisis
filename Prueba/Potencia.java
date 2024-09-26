package Prueba;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer numero para hacer modulo:");
        int num1 = scanner.nextInt();
        System.out.println("Segundo numero para hacer modulo:");
        int num2 = scanner.nextInt();
        int resultado = num1 ^ num2;
        System.out.println("la potencia de " + num1 + " elevado a la " + num2 + " es: " + resultado);
        scanner.close();
    }
}
