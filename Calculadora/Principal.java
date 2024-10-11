package calculadora;

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
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                suma.main(args);
                break;
            case 2:
                resta.main(args);
                break;
            case 3:
                multiplicacion.main(args);
                break;
            case 4:
                division.main(args);
                break;
            default:
                System.out.println("Opción no válida");
        }
        scanner.close();
    }

}
