import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Please insert a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        System.out.println(even(number));
    }

    public static String even(int value){
        return value%2 == 0 ? "Number is even" : "Number is odd"; 
    }
}
