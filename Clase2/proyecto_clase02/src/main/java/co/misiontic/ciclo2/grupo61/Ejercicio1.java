package co.misiontic.ciclo2.grupo61;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        welcomeMessage();
        //Gets the birthday in a single string
        String birthDay = getBirthDay();
        // Transform the string birthday in array format
        String[] bDayArray = birthDateToArray(birthDay);
        // Transform the bday string array into int array
        int[] bDayInt = stringToIntArr(bDayArray);
        // Calculates the lucky number based on bday array
        int luckyNumber = getLuckyNumber(bDayInt);
        goodbyMessage(luckyNumber);
    }

    private static void goodbyMessage(int luckyNumber) {
        System.out.println("Your lucky number is: " + luckyNumber + "!");
    }

    private static int getLuckyNumber(int[] bDayInt) {
        int sumArray = 0;
        for(int i = 0; i < bDayInt.length; i++){
            sumArray += bDayInt[i];
        }

        int sumOfNumbers = 0;
        int modulus = sumArray;
        while(sumArray > 0){
            modulus = sumArray % 10;
            sumOfNumbers += modulus;
            sumArray /= 10;
        }

        return sumOfNumbers;
    }

    private static int[] stringToIntArr(String[] bDayArray) {
        //String[] bdaySarray = bDayArray;
        int[] bdayIntArray = new int[3];
        for(int i = 0; i < bDayArray.length; i++){
            bdayIntArray[i] = Integer.parseInt(bDayArray[i]);
        }
        
        return bdayIntArray;
    }

    private static String[] birthDateToArray(String birthDate) {
        String[] birthDateArray = birthDate.split("/", 3);
        return birthDateArray;
    }

    private static void welcomeMessage() {
        String message = "Welcome to the Lucky Number App. \n";
        System.out.println(message);
    }

    private static String getBirthDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your birth date: dd/mm/yyyy");
        String date = scanner.nextLine();
        scanner.close();
        return date;
    }
}
