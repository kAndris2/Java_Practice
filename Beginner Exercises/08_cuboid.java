import java.util.Scanner;
import java.lang.Math;

class Cuboid
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

        double l = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        System.out.println("\n1. diagonal (length-width): " + l);

        double k = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        System.out.println("2. diagonal (width-height): " + k);

        double t = Math.sqrt(Math.pow(length, 2) + Math.pow(height, 2));
        System.out.println("3. diagonal (length-height): " + t);

        double body_diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2) + Math.pow(height, 2));
        System.out.println("Body diagonal: " + body_diagonal);

        int surface = 2 * ((length * width) + (length * height) + (width * height));
        System.out.println("Surface: " + surface);

        int volume = length * width * height;
        System.out.println("Volume: " + volume);

        input.close();
    }
}