import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          while(true){
              System.out.println("1.add, 2.sub,3.Mul, 4.exit ");
              System.out.println("enter your choice");
              int ch =scan.nextInt();
              if (ch==1){
                  System.out.println("enter two numbers");
                  int a = scan.nextInt();
                  int b = scan.nextInt();
                  System.out.println("Result: " + (a+b));
              }
              if (ch==2){
                  System.out.println("enter two numbers");
                  int a = scan.nextInt();
                  int b = scan.nextInt();
                  System.out.println("Result: " + (a-b));
              }
              if (ch==3){
                  System.out.println("enter two numbers");
                  int a = scan.nextInt();
                  int b = scan.nextInt();
                  System.out.println("Result: " + (a*b));
              }
              if (ch==4){
                  System.out.println("end of the program");
              }
             else
              {
                  System.out.println("invalid option");
              }
          }
    }

}
