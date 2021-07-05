import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese numero entero: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();
        System.out.println("El doble es: " + doble(numero) + ".");
        System.out.println("El triple es: " + triple(numero) + ".");
    }

    public static int doble(int numero){
        return numero * 2;
    }

    public static int triple(int numero){
        return numero * 3;
    }
}
