import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length n (n must greater than 2): ");
        int n = scanner.nextInt();
        scanner.close();
        int Fibonacci[] = new int[n+2];
        Fibonacci[0] = 0;
        Fibonacci[1] = 1;
        System.out.print(Fibonacci[0]);
        System.out.print("\t" + Fibonacci[1]);
        for (int i = 2; i <= n; i++)
        {
            Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i-2];
            System.out.print("\t" + Fibonacci[i]);
        }
    }
}
