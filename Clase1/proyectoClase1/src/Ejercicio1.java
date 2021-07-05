import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        sc.close();
        System.out.println(saludo(nombre));
    }

    public static String saludo(String nombre) {
        return "Hola " + nombre + "!";
    }
}
