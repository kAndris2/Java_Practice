import java.util.Scanner;

class Company
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your company's annual revenue:");
        int revenue = input.nextInt();

        System.out.println("Enter your company's annual spend:");
        int spend = input.nextInt();

        if (revenue > spend)
            System.out.printf("\nProfiatble!\n - Profit: %d", revenue - spend);
        else if (spend > revenue)
            System.out.printf("\nLoss!\n - Rate of loss: %d", spend - revenue);
        else
            System.out.println("\nBreak even!");

        input.close();
    }
}