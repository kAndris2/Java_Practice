import java.util.Scanner;

class Average
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to count?");
        int length = input.nextInt();

        float[] numbers = new float[length];
        float sum = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.printf("\nEnter the %d. number:\n", i + 1);
            float num = input.nextFloat();
            numbers[i] = num;
            sum += num;
        }

        System.out.println("\nAverage: " + sum / length);

        input.close();
    }
}