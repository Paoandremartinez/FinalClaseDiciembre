import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leerDato = new Scanner(System.in);
        System.out.println("Variable 1 ");
        double a = Double.parseDouble(leerDato.nextLine());
        System.out.println("Variable 2 ");
        double b = Double.parseDouble(leerDato.nextLine());
        System.out.println("Variable 2 ");
        double c = Double.parseDouble(leerDato.nextLine());

        double suma= a+b+c;
        double resta=a-b-c;
        double multipicar=a*b*c;
        double division=(a+b)/c;

        try{
            System.out.println("la suma de los numeros es " +suma);
            System.out.println("la resta de los numeros es " +resta);
            System.out.println("la multiplicacion de los numeros es " +multipicar);
            System.out.println("la división de los numeros es " +division);

        }
        catch (NumberFormatException e){
            System.out.println("El ID ingresado no es un número valido");
        }



    }
}
