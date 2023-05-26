package manoj;

import java.util.Scanner;
public class PrintNaturalNumber {
//Sum and average of all the numbers added by user with limit
    public static String errorText = "Invalid input! You have to enter a number";
    public static String defaultText = "Enter the number of natural numbers you want to add";

    public static int getInteger(){
        Scanner limit = new Scanner(System.in);
        System.out.println(defaultText);
        try {
            int number = Integer.parseInt(limit.nextLine());
            return number;
        }catch(NumberFormatException e){
            System.out.println(errorText);
            return getInteger();
        }
    }

    public static int getInteger(String text){
        Scanner limit = new Scanner(System.in);
        System.out.println(text);
        try {
            int number = Integer.parseInt(limit.nextLine());
            return number;
        }catch(NumberFormatException e){
            System.out.println(errorText);
            return getInteger(text);
        }
    }

    public static int getInteger(String text, String errorMessage){
        Scanner limit = new Scanner(System.in);
        System.out.println(text);
        try {
            int number = Integer.parseInt(limit.nextLine());
            return number;
        }catch(NumberFormatException e){
            System.out.println(errorMessage);
            return getInteger(text, errorMessage);
        }
    }

    public static int getAllInputWithSum(int limit){
        //get the sum of all numbers
        Scanner number = new Scanner(System.in);
        System.out.println("Enter natural numbers");
        int sum = 0;
        try{
            for(int i =0; i<limit ; i++){
                sum += Integer.parseInt(number.nextLine());
            }
            return sum;
        }catch(NumberFormatException e){
            System.out.println("Invalid input! You have to enter a number");
            return getAllInputWithSum(limit);
        }
    }

    public static int[] getAllIntegers(int limit){
        //get all the integers entered by user
        Scanner number = new Scanner(System.in);
        System.out.println("Enter natural numbers");
        int[] allIntegers = new int[limit];
        for(int i =0; i<limit ; i++){
            try{
                allIntegers[i] = Integer.parseInt(number.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Invalid input! You have to enter a number");
                i-=1;
            }
        }
        return allIntegers;
    }
    public static int[] getAllInputWithOutSumWithIndividualIntegerFail(int limit){
        return getAllIntegers(limit);
    }
    public static int[] getAllInputWithOutSum(int limit){
        //get the all the integers added by user
        Scanner number = new Scanner(System.in);
        System.out.println("Enter natural numbers");
        int[] allIntegers = new int[limit];
        try{
            for(int i =0; i<limit ; i++){
                allIntegers[i] = Integer.parseInt(number.nextLine());
            }
            return allIntegers;
        }catch(NumberFormatException e){
            System.out.println("Invalid input! You have to enter a number");
            return getAllInputWithOutSum(limit);
        }
    }
    public static void printSumAndAverageOfNaturalNumber(){
            int number = getInteger();
            System.out.println("limit is "+ number);
            int sum = 0;
            double average;
//            int sum = getAllInputWithSum(number);
//            average = (double) sum/number;
//            int[] allIntegers = getAllInputWithOutSum(number);
//            for(int i = 0; i < number ; i++){
//                sum+=allIntegers[i];
//            }
            int[] allIntegers = getAllInputWithOutSumWithIndividualIntegerFail(number);
            for(int i = 0; i < number ; i++){
                sum+=allIntegers[i];
            }
            average = (double) sum/number;
            System.out.println("Sum of all numbers is "+ sum);
            System.out.println("Average of all numbers is "+ average);
    }

    public static void printNaturalNumber(){
        int number = getInteger();
        System.out.println("Natural number will be printed to "+ number);
        for(int i = 0; i <= number ; i++){
            System.out.println(i);
        }
    }

    public static void printNaturalNumberInReverse(){
        int number = getInteger();
        System.out.println("Natural number will be printed to "+ number);
        for(int i = number; i >= 0 ; i--){
            System.out.println(i);
        }
    }

    public static void printTables(){
        int number = getInteger("Enter number of which table you want to print");
        for(int i = 1; i <= 10 ; i++){
            System.out.println(number+" x "+i + " = "+ number*i);
        }
    }
    public static void printReverseTables(){
        int number = getInteger("Enter number of which table you want to print");
        for(int i = 10; i >= 1 ; i--){
            System.out.println(number+" x "+i + " = "+ number*i);
        }
    }
}

