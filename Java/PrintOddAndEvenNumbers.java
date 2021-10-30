import java.util.Scanner;
public class PrintOddAndEvenNumbers
{
    public static void main (String args[])
    {
    int i;
    int y;
    Scanner scan = new Scanner(System.in);
    //create a scanner object for input
    System.out.print("Print all even number until:\n");
    int num = scan.nextInt();//Reads input from user and stored in variable num
    System.out.print("Even number from i to "+num+" are: \n");
    i=1;
    while (i <= num)
    {//loop for iterate from 1 to maximum
        if (i%2 == 0)
        {
            System.out.print(i+"\n");
        }
        i++;
    }
    y = 1;
    System.out.print("Odd number from y to "+num+" are: \n");
    while (y <= num)
    {//loop for iterate from 1 to maximum
        if (y%2 == 1)
        {
        System.out.print(y+"\n");
        }
        y++;
    }
    }
}