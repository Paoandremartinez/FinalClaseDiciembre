import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner tabla = new Scanner(System.in);
        System.out.println("Cual es la tabla de multiplicar que quiere realizar");
        int num = Integer.parseInt(tabla.nextLine());
        int i=1;
        int contador=0;

        try {
            System.out.println("La tabla de multiplicar del " + num + " es ");
            while (i<=20) {
            //for (int i = 1; i <= 20; i++) {

            System.out.println(num + " x " + i + " = " + (num * i));
                i=i+1;

        }
    }
        catch(
    NumberFormatException e)

    {
        System.out.println("Número no valido");
    }

}
}
