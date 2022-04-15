import java.util.ArrayList;
import java.util.Scanner;

class MonthIndex
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month:");
        int month_index = input.nextInt();

        ArrayList<Integer> summer = new ArrayList<>();
        summer.add(6);
        summer.add(7);
        summer.add(8);

        ArrayList<Integer> autumn = new ArrayList<>();
        autumn.add(9);
        autumn.add(10);
        autumn.add(11);

        ArrayList<Integer> winter = new ArrayList<>();
        winter.add(12);
        winter.add(1);
        winter.add(2);
        
        ArrayList<Integer> spring = new ArrayList<>();
        spring.add(3);
        spring.add(4);
        spring.add(5);

        if (summer.contains(month_index))
            System.out.println("\nSummer");
        else if (autumn.contains(month_index))
            System.out.println("\nAutumn");
        else if (winter.contains(month_index))
            System.out.println("\nWinter");
        else if (spring.contains(month_index))
            System.out.println("\nSpring");

        input.close();
    }
}