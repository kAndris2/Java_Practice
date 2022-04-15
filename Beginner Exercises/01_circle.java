import java.util.Scanner;

class Circle 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the radius: ");
    int radius = input.nextInt();

    double area = Math.pow(radius, 2) * Math.PI;
    double circumference = (2 * radius) * Math.PI;
    double volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;
    double surface = 4 * Math.PI * Math.pow(radius, 2);

    System.out.println("\nArea: " + area);
    System.out.println("Circumference: " + circumference);
    System.out.println("Volume: " + volume);
    System.out.println("Surface: " + surface);

    input.close();
  }
}