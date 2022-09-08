import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Esfera e = new Esfera(0);
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el radio: ");
        e.setRadio(leer.nextDouble());

        System.out.println("El area es: "+e.area());
        System.out.println("Volumen: "+e.volumen());
        System.out.println("Diametro: "+e.diametro());
        System.out.println("Circunferencia: "+e.circunferencia());
    }
}
