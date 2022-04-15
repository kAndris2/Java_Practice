import java.util.ArrayList;
import java.util.Scanner;

class MonthName
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month:");
        String month = input.nextLine();

        ArrayList<String> summer = new ArrayList<>();
        summer.add("June");
        summer.add("July");
        summer.add("August");

        ArrayList<String> autumn = new ArrayList<>();
        autumn.add("September");
        autumn.add("October");
        autumn.add("November");

        ArrayList<String> winter = new ArrayList<>();
        winter.add("December");
        winter.add("January");
        winter.add("February");
        
        ArrayList<String> spring = new ArrayList<>();
        spring.add("March");
        spring.add("April");
        spring.add("May");

        if (summer.contains(month))
            System.out.println("\nSummer");
        else if (autumn.contains(month))
            System.out.println("\nAutumn");
        else if (winter.contains(month))
            System.out.println("\nWinter");
        else if (spring.contains(month))
            System.out.println("\nSpring");

        input.close();
    }
}