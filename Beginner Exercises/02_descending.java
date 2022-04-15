import java.util.Scanner;
import java.util.Arrays;

class Descend 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int length = input.nextInt();
    
    int[] nums = new int[length];
    for (int i = 0; i < nums.length; i++)
    {
        System.out.printf("\nEnter the %d. number\n", i + 1);
        int num = input.nextInt();
        nums[i] = num;
    }
    
    Arrays.sort(nums);
    System.out.println("\nResult:");

    for (int i = nums.length; i-- > 0; )
    {
        System.out.println(nums[i]);
    }

    input.close();
  }
}