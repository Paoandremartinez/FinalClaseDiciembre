import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String miEdad= String.valueOf(15);
        String profesion ="Ingeniero de Sistemas";
        String miNombre= "Antony";
        System.out.println(miNombre.toUpperCase(Locale.ROOT)+ " tiene " + miEdad + " y su profesión es " +profesion);
    }

}