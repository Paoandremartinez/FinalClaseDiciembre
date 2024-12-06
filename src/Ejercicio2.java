import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leerOpcion = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("******************************************************");
            System.out.println("**                                                  **");
            System.out.println("**    1. Cuenta Corriente                           **");
            System.out.println("**    2. Cuenta Ahorro                              **");
            System.out.println("**    3. Cuenta Nomina                              **");
            System.out.println("******************************************************");
            System.out.println("Digita tu opción ");
            while (!leerOpcion.hasNextInt()) {
                System.out.println("Por favor digita una opción valida");
                System.out.println("Ingresa la opción");
            }
                opcion = leerOpcion.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("1. Cuenta Corriente  ");

                        break;
                    case 2:
                        System.out.println("2. Cuenta Ahorro    ");
                        break;
                    case 3:
                        System.out.println("3. Cuenta nomina    ");
                        break;
                    default:
                        System.out.println("Número no válido, por favor verifique");
                }

        } while (opcion != 4);
    }
}
