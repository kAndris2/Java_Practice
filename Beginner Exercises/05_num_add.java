import java.util.Scanner;

class Num_Add
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = input.nextInt();

        System.out.println("Enter another number:");
        int b = input.nextInt();

        System.out.println("\nSum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Quotient: " + (a / b));

        input.close();
    }
}