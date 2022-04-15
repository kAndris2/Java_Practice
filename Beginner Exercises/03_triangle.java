import java.util.Scanner;

class Triangle 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the length of the 'a' side of the triangle:");
    int a = input.nextInt();

    System.out.println("Enter the length of the 'b' side of the triangle:");
    int b = input.nextInt();
    
    System.out.println("Enter the length of the 'c' side of the triangle:");
    int c = input.nextInt();
    
    if ((a+b > c) && (a+c > b) && (b+c > a))
        System.out.println("\nEditable!");
    else
        System.out.println("\nNot editable!");

    input.close();
  }
}