public class Sample4 {
    public static void main(String[] args) {
        char ch = 'a';
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