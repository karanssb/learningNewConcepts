import java.util.Scanner;

public class scannerSample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the character");

        char ch = scan.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper Case");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("numeric");
        } else {
            System.out.println("symbol");
        }
    }
}