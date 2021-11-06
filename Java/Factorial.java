import java.util.Scanner;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Factorial: ");
        int n = scanner.nextInt();
        if (n == 0)
            System.out.println("1");
        int factorial = n;
        scanner.close();
        if (n >= 1)
        {
        for (int i = 1; i < n; i++)
        {
            factorial = factorial * (n - i);
        }
        System.out.println(factorial);
        }
    }
    
}
