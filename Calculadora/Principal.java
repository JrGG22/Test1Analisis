package Calculadora;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion multiplicacion = new Multiplicacion();
        Division division = new Division();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("5. Potenci");
        System.out.println("6. Residuo");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                suma.realizarSuma();
                break;
            case 2:
                resta.realizarResta();
                break;
            case 3:
                multiplicacion.realizarMultiplicacion();
                break;
            case 4:
                division.realizarDivision();
                break;
            case 5:
                Potencia potencia = new Potencia();
                potencia.realizarPotencia();
                potencia.cerrarScanner();
                break;
            case 6:
                Residuo residuo = new Residuo();
                residuo.realizarResiduo();
                residuo.cerrarScanner();
                break;
            default:
                System.out.println("Opción no válida");
        }
        scanner.close();
    }

}
