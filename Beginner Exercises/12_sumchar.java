import java.util.Scanner;

class SumChar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        String number = input.nextLine();

        int sum = 0;
        for (String ch : number.split(""))
            sum ++;
        
        System.out.printf("\nThis number is having %d digits.", sum);

        input.close();
    }
}