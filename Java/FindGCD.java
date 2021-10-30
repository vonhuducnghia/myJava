import java.util.Scanner;
public class FindGCD
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int gcd = 1;
        scanner.close();
        for (int i = 1; i <= n && i <= m; i++)
        {
            if (n%i ==0 && m%i == 0)
            gcd = i;
        }
        System.out.print("The GCD is: " + gcd);
    }
}
