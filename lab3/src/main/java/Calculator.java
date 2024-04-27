
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Simple Calculator!");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = add(num1, num2);
        System.out.println("Result: " + result);
        
        scanner.close();
    }
    
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
}