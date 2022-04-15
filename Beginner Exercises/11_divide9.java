import java.util.Scanner;

class Divide
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        String number = input.nextLine();

        int sum = 0;
        for (String ch : number.split(""))
            sum += Integer.parseInt(ch);

        if (sum % 9 == 0)
        {
            int num = Integer.parseInt(number);
            if (num % 9 == 0)
                System.out.println("\nThe number is divisible by 9!");
        } 
        else
            System.out.println("\nThe number is cannot be divided by 9!");

        input.close();
    }
}