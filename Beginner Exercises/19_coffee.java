import java.util.Scanner;

class Coffee
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int price = 50;

        System.out.println("(1) - Without glass");  
        System.out.println("(2) - Double sugar");
        System.out.println("(3) - Frothy coffee");   
        System.out.println("\nChoose coffee:");  
        
        int choose = input.nextInt();
        switch(choose)
        {
            case 1:
                price -= 10;
                break;
            case 2:
                price += 20;
                break;
            case 3:
                price += 50;
                break;
        }

        System.out.printf("\nTotal: %dFt", price);

        input.close();
    }
}