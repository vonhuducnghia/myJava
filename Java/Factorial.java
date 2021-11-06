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

/*class Factorial
{
    public static void main(String args[])
    {
        int i,fact=1;
        int number=11;//It is the number to calculate factorial
        for(i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}*/