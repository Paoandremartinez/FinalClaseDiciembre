import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

            Scanner totalCompra = new Scanner(System.in);
            System.out.println("Cual es el total de su compra ");
            double compra = Double.parseDouble(totalCompra.nextLine());
            if (compra >=1000){
                double mayor;
                double porcentaje;
                mayor= (double) (compra*(0.20));
                porcentaje=compra-mayor;
                System.out.println("nuevo total " +porcentaje);

            }
       else if (compra >=500){
            double mayor;
            double porcentaje;
            mayor= (double) (compra*(0.10));
            porcentaje=compra-mayor;
            System.out.println("nuevo total " +porcentaje);

        }else if (compra <=500){
                System.out.println("No tienes descuento " +compra);
            }


    }
}
