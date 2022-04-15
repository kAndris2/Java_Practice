import java.util.Scanner;

class Temperature
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String[] months = {
                            "January",
                            "February",
                            "March",
                            "April",
                            "May",
                            "June",
                            "July",
                            "August",
                            "September",
                            "October",
                            "November",
                            "December"
                            };

        int[] temperature = new int[months.length];
        for (int i = 0; i < months.length; i++)
        {
            System.out.printf("What was the average temperature in %s?\n", months[i]);
            temperature[i] = input.nextInt();
        }

        int sum = 0;
        for (int value : temperature)
            sum += value;

        System.out.printf("\nThe average annual temperature was %d celsius.", sum / months.length);

        input.close();
    }
}