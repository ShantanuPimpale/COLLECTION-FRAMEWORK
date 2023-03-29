import java.util.*;

    public class Basic {

        Scanner sc  =new Scanner(System.in);

        public void even_odd_check() {
            Scanner sc = new Scanner(System.in);
            int evensize = 0;
            int oddsize = 0;

            System.out.println("Enter the number of elements.");
            int n;
            n = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            int obj;
            System.out.println("Enter the elements.");

            for (int i = 0; i < n; i++) {
                obj = sc.nextInt();
                list.add(obj);
            }

            System.out.println(list);
            System.out.println("Even elements.");

            for (int i = 0; i < list.size(); i++) {

                if (list.get(i) % 2 == 0) {
                    System.out.println(list.get(i));
                    evensize++;
                }
            }
            System.out.println("Odd elements.");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 != 0) {
                    System.out.println(list.get(i));
                    oddsize++;
                }
            }
            System.out.println("Count of Even numbers is=" + evensize);
            System.out.println("Count of Odd numbers is=" + oddsize);


        }


public static boolean isPrime(int number)
{
    for (int i = 2; i <=Math.ceil(Math.sqrt(number)); i=i+2) {
        if(number%i==0){
            System.out.println("Number is not prime.");
            return false;
        }
            else
        {
            System.out.println("Number is prime.");
        }
    }


    return true;
}
public void Palindrom_Check(String str)
        {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            String rev = sb.toString();
            if (rev.equals(str)) {
                System.out.println("String is palindrom.");
            } else {
                System.out.println("String is not palindrom.");
            }
        }
    }