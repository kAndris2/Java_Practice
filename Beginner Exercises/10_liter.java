import java.util.Scanner;

class Liter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight value in deciliter:");
        int deciliter = input.nextInt();

        int hectoliter = 0;
        if (deciliter >= 1000)
        {
            hectoliter = deciliter / 1000;
            deciliter %= 1000;
        }

        int liter = 0;
        if (deciliter >= 10)
        {
            liter = deciliter / 10;
            deciliter %= 10;
        }

        System.out.println("\nHectoliter: " + hectoliter);
        System.out.println("Liter: " + liter);
        System.out.println("Deciliter: " + deciliter);

        input.close();
    }
}