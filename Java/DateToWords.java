import java.util.Scanner;
public class DateToWords
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day, month and year respectively (only 1 digit for number under 10): ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();
        switch (day)
        {
            case 1:
            System.out.print("first");
            case 2:
            System.out.print("Second");
            case 3:
            System.out.print("Third");
            case 4:
            System.out.print("Fourth");
            case 5:
            System.out.print("Fifth");
            case 6:
            System.out.print("Sixth");
            case 7:
            System.out.print("Seventh");
            case 8:
            System.out.print("Eighth");
            case 9:
            System.out.print("Ninth");
            case 10:
            System.out.print("Tenth");
            case 11:
            System.out.print("");
            case 12:
            System.out.print("Dec");
            case 13:
            System.out.print("Dec");
            case 14:
            System.out.print("Dec");
            case 15:
            System.out.print("Dec");
            case 16:
            System.out.print("Dec");
            case 17:
            System.out.print("Dec");
            case 18:
            System.out.print("Dec");
            case 19:
            System.out.print("Dec");
            case 20:
            System.out.print("Dec");
            case 21:
            System.out.print("Dec");
            case 22:
            System.out.print("Dec");
            case 23:
            System.out.print("Dec");
            case 24:
            System.out.print("Dec");
            case 25:
            System.out.print("Dec");
            case 26:
            System.out.print("Dec");
            case 27:
            System.out.print("Dec");
            case 28:
            System.out.print("Dec");
            case 29:
            System.out.print("Dec");
            case 30:
            System.out.print("Dec");
            case 31:
            System.out.print("Dec");
        }
        switch (month)
        {
            case 1:
            System.out.print("Jan");
            case 2:
            System.out.print("Feb");
            case 3:
            System.out.print("Mar");
            case 4:
            System.out.print("Apr");
            case 5:
            System.out.print("May");
            case 6:
            System.out.print("Jun");
            case 7:
            System.out.print("Jul");
            case 8:
            System.out.print("Aug");
            case 9:
            System.out.print("Sep");
            case 10:
            System.out.print("Oct");
            case 11:
            System.out.print("Nov");
            case 12:
            System.out.print("Dec");
        }
    }
}
