import java.util.Scanner;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Factorial: ");
        double n = scanner.nextDouble();
        if (n == 0)
            System.out.println("1");
        double factorial = n;
        scanner.close();
        if (n >= 1)
        {
        for (double i = 1; i < n; i++)
        {
            factorial = factorial * (n - i);
        }
        System.out.println(factorial);
        }
    }
}