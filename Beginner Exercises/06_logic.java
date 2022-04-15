import java.util.Scanner;

class Logic
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a logical value:");
        boolean logic = input.nextBoolean();

        if (logic)
            System.out.println("\nIGAZ");
        else
            System.out.println("\nHAMIS");
    
        input.close();
    }
}