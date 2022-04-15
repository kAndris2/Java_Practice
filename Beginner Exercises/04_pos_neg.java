import java.util.Scanner;

class PosNeg 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number:");
    int num = input.nextInt();
    
    if(num > 0)
        System.out.println("Positive");
    else
        System.out.println("Negative");

    input.close();
  }
}