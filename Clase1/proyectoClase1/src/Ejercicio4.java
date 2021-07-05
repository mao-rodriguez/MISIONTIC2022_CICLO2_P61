import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Please insert celsius degrees: ");
        float celsius = captureValue();
        System.out.println(celsius + "°C is " + celsiusToFahrenheit(celsius) + "°F");
    }

    public static float celsiusToFahrenheit(float celsius) {
        return (celsius * 9/5) + 32;
    }

    public static float captureValue(){
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        scanner.close();
        return number;
    }
}

