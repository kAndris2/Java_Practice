import java.util.Scanner;

class Password
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String password = "pswd";

        int i = 0;
        String pass = "";
        int max = 5;
        while (pass.equals(password) == false)
        {
            i++;
            System.out.printf("\n(%d/%d) Enter your password:\n", i, max);
            pass = input.nextLine();

            if (i == max)
                break;
            else if (pass.equals(password) == false)
                System.out.println("\nPassword rejected!");
        }

        if (pass.equals(password))
            System.out.println("\nPassword accepted!");
        else
            System.out.println("\nYou tried too much!\n - Password rejected!");

        input.close();
    }
}