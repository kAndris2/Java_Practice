import java.util.Scanner;

class Cuboid2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the cuboid length:");
        int length = input.nextInt();

        System.out.println("Enter the cuboid width:");
        int width = input.nextInt();

        System.out.println("Enter the cuboid height:");
        int height = input.nextInt();

        if ( (length * 2) + (height * 2) > (width * 2) + (height * 2) )
            System.out.printf("\nRectangle data: 2x width(%d), 2x height(%d)", width, height);
        else
            System.out.printf("\nRectangle data: 2x length(%d), 2x height(%d)", length, height);

        int surface = 2 * ((length * width) + (length * height) + (width * height));
        System.out.println("\nSurface: " + surface);

        int volume = length * width * height;
        System.out.println("Volume: " + volume);

        input.close();
    }
}