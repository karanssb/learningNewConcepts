public class digitCount {
    public static void main(String[] args){
        int n=7659;
        if (n>=0 && n<=9) {
            System.out.println("Single Digit number");
        }
        else if (n>=10 && n<=99) {
            System.out.println("Double Digit number");
        }
        else if (n>=100 && n<=999) {
            System.out.println("Three Digit number");
        }
        else
        {
            System.out.println("other digit");
        }

            int sides=4;
            if (sides==3) {
                System.out.println("Triangle Shape");
            }
            else if (sides==4) {
                System.out.println("Rectangle Shape");
            }
            else if (sides==5) {
                System.out.println("pentagon Shape");
            }
            else
            {
                System.out.println("other shape");
            }
    }
}