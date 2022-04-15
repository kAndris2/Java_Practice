import java.util.Scanner;

class Banknote
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount:");
        int amount = input.nextInt();

        int[] amounts = {
                            20000,
                            10000,
                            5000,
                            2000,
                            1000,
                            500,
                            200,
                            100,
                            50,
                            20,
                            10,
                            5
                        };

        for (int value : amounts)
        {
            if (amount / value >= 1)
            {
                System.out.printf("\n%dFt - %dpc(s)", value, (amount / value));
                amount %= value;
            }
        }
        
        if (amount > 0)
            System.out.printf("\nRemaining amount: %dFt\n", amount);

        input.close();
    }
}