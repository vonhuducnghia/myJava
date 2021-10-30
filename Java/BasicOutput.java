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

/*import java.util.Scanner;
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
}*/

// Exer 3, 6, 7, 8

/*import java.util.Scanner;
public class BasicOutput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cel degree:");
        double cel = sc.nextDouble();
        System.out.println("You entered cel degree: " + cel);
        double ctof = 9.0/5 * (cel + 32);
        System.out.print("Here is the conversion from C to F: " + ctof);

        double fah = sc.nextDouble();
        System.out.println("You entered fah degree: " + fah);
        double ftoc = 5.0/9 * (fah - 32);
        System.out.print("Here is the conversion from F to C: " + ftoc);
        sc.close();
    }
}*/

/*import java.util.Scanner;
public class BasicOutput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diameter:");
        double dia = sc.nextDouble();
        System.out.println("You entered diameter: " + dia);
        double rad = dia/2;
        double square = Math.PI * Math.pow(rad, 2);
        System.out.print("The square of circle is: " + square);
        sc.close();
    }
}*/

/*import java.util.Scanner;
public class BasicOutput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 3 edges size of a triangle: ");
        int edge1 = sc.nextInt();
        int edge2 = sc.nextInt();
        int edge3 = sc.nextInt();
        System.out.println("You entered 3 edges: " + edge1 + edge2 + edge3);
        System.out.println(edge1 == edge2 && edge2 == edge3 ? "Equilateral triangle" : "Isosceles triangle");
        sc.close();
    }
}*/

/*import java.util.Scanner;
public class BasicOutput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 2 edges size of a triangle: ");
        double edge1 = sc.nextDouble();
        double edge2 = sc.nextDouble();
        System.out.println("You entered 2 edges: " + edge1 + edge2);
        double hypot = Math.hypot(edge1, edge2);
        System.out.println(" The hypo is: " + hypot);
        sc.close();
    }
}*/

// Quadratic solving algorithm
import java.util.Scanner;  
public class BasicOutput
    {
    public static void main(String[] Strings)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        double d = b * b - 4.0 * a * c;
        if (d> 0.0)
    {
        double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
        double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
        System.out.println("The roots are " + r1 + " and " + r2);
    }
    else if (d == 0.0)
    {
        double r1 = -b / (2.0 * a);
        System.out.println("The root is " + r1);
    }
    else
    {
        System.out.println("Roots are not real.");
    }
    }
}