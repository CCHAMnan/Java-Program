import java.util.Scanner;

public class Practice1 {

    //For addition
    public static int sum(int a, int b) {
        return a + b;
    }

    //For Division
    public static double divide(int a, int b) {
        return a / b;
    }

    //For Subtraction
    public static int minus(int a, int b) {
        return a - b;
    }

    //For Multiplication
    public static int multiplication(int a, int b) {
        return a * b;
    }

    //For modulous
    public static int modulo(int a, int b) {
        return a % b;
    }   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number for a: ");
        int a = scan.nextInt();
        System.out.print("Enter number for b: ");
        int b = scan.nextInt();
        scan.close();

        System.out.println("Sum : " + sum(a, b));
        System.err.println("Minus: " + minus(a, b));
        System.out.println("Divide: " + divide(a, b));
        System.out.println("Multipliction: " + multiplication(a, b));
        System.out.println("Module: " + modulo(a, b));
        
    }
}