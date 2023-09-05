import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println("enter the number");
            int n = scan.nextInt();
            for(int i=1;i<=10;i++)
            {
                System.out.println(n +" * " +  i + " = "+ (n*i) );
            }
        System.out.println("do you want to continue y/n");
        char ch=scan.next().charAt(0);
        if(ch=='n')
            break;
        }

   }
}
