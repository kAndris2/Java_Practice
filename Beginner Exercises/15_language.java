import java.util.Scanner;

class Language
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String[] questions = {
                            "Beszélsz magyarul?",
                            "Do you Speak english?",
                            "Sprichst du deutsch?",
                            "Parlez-vous français?",
                            "Parli italiano?",
                            "Hablas español?"
                            };

        int index = -1;
        for (int i = 0; i < questions.length; i++)
        {
            System.out.println(questions[i]);
            String reply = input.nextLine();

            if (reply.equals("yes"))
            {
                index = i;
                break;
            }
        }

        switch(index)
        {
            case 0:
                System.out.println("\nSzia! Legyen szép napod!");
                break;
            case 1:
                System.out.println("\nHi! Have a nice day!");
                break;
            case 2:
                System.out.println("\nHallo! Einen schönen Tag noch!");
                break;
            case 3:
                System.out.println("\nSalut! Passez une bonne journée!");
                break;
            case 4:
                System.out.println("\nHi! Buona giornata!");
                break;
            case 5:
                System.out.println("\nHola! ¡Que tengas un buen día!");
                break;
            default:
                System.out.println("\n♥");
        }

        input.close();
    }
}