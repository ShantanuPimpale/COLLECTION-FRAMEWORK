import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Basic obj = new Basic();

        int a=0;

        do {
            System.out.println("Enter your choice.");
            System.out.println("1.Odd even number check from array");
            System.out.println("2.Check if string is palindrom or not.");
            System.out.println("3.Check if number is prime or not.");
            System.out.println("4.Exit");
            a = sc.nextInt();

            switch (a) {
                case 1:
                    obj.even_odd_check();
                    break;

                case 2:
                    String str;
                    System.out.println("Enter string.");
                    str=sc.next();
                    obj.Palindrom_Check(str);
                    break;
                case 3:
                    System.out.println("Enter number.");
                    int n=sc.nextInt();
                    obj.isPrime(n);
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Invalid input...");
            }

        }while (a!=4);
    }
}
