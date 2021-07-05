import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Por favor ingrese un número para conocer cuantas cifras tiene: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();
        int cifras = numeroDigitos(numero);
        System.out.println("El número ingresado tiene: " + cifras + " Cifras.");
    }
    
    public static int numeroDigitos(int numero){
        int cifras = 0;
        while(numero != 0){
            numero /= 10;
            cifras++;
        }
        return cifras;
    }
}

