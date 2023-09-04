public class Sample3 {
    public static void main(String[] args) {
        int n=465;
        if (n >= 0 && n <= 9) {
            System.out.println("Single digit");
        } else if (n >= 10 && n <= 99) {
            System.out.println("Double Digit");
        } else if (n >= 100 && n <= 999) {
            System.out.println("three digit");
        } else {
            System.out.println("other digit");
        }
    }
}
