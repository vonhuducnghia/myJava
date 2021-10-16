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

public class BasicOutput
{
    public static void main(String args[])
    {
        int num1 = 10, num2 = 20, sum;
        System.out.print("The addition of ");
        System.out.println(num1 + "and" + num2 + "is: ");
        System.out.println(num1 + num2);

        System.out.print(num1 + "+" + num2 + "=");
        System.out.println(num1 + num2);

        System.out.println(num1 + "+" + num2 + "= " + num1 + num2);
    }
}