import java.util.Scanner;

public class countOfGivenNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        int count=0,r;
        while (n > 0) {

            r=n%10;
            if(r==0)
                count++;
            n=n/10;
        }
        System.out.println("zero count:" + count);
    }
}
