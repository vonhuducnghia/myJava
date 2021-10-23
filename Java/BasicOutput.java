/*public class BasicOutput
{
    static int i = 21;
    static char ch = 'I';
    static double d = 2.1;
    static float f = 20.01f;
    static boolean b = true;
    static String s = "Irene Adler";
    public static void main(String args[])
    {
        System.out.println(i);
        System.out.println(ch);
        System.out.println(d);
        System.out.println(f);
        System.out.println(b);
        System.out.println(s);
    }
}*/

/*public class BasicOutput
{
    public static void main(String args[])
    {
        int num1 = 10, num2 = 20;
        System.out.print("The addition of ");
        System.out.println(num1 + "and" + num2 + "is: ");
        System.out.println(num1 + num2);

        System.out.print(num1 + "+" + num2 + "=");
        System.out.println(num1 + num2);

        System.out.println(num1 + "+" + num2 + "= " + num1 + num2);
    }
}*/
/*public class BasicOutput
{
    public static void main(String args[])
    {
        System.out.println("\"Hello the World!\""); // Using Escape Sequence
    }
}*/

/*public class BasicOutput
{
    public static void main(String[] args)
    {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nConversion of int to byte."); b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("\nConversion of double to int."); i = (int) d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("\nConversion of double to byte."); b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }
}*/

import java.util.Scanner;
public class BasicOutput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); System.out.println("You entered string " + s);
        int i = sc.nextInt(); System.out.println("You entered integer " + i);
        float f = sc.nextFloat();
        System.out.println("You entered float " + f);
        sc.close();
    }
}