import java.util.Scanner;

public class numberofDays {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("type the number scanner" + scan);
        int n = scan.nextInt();
        System.out.println("type the number scanner" + scan);

//                int n = 2;
        if (n >= 1 && n <= 12) {
            if (n==2){
                System.out.println("NUmber of days is 28/29");
            }
            else
            {
                if (n==4 || n==6 || n==9  || n==11) {
                    System.out.println("NUmber of days is 30");
                }
                else {
                    System.out.println("NUmber of days is 31");
                }
            }
          }
        else {
            System.out.println("not a valid month");
        }
    }

}
