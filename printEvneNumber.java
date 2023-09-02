public class printEvneNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i" + i);
            }
        }


        int count = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                count++;
            }

        }
        System.out.println(" ab " + count);


        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        System.out.println("  sum :" + sum);


        int n = 6;
        for (int i = 1; i <= 6; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        int count1 = 0, n1 = 6;
        for (int i = 1; i <= 10; i++) {
            if (n1 % i == 0) {
                count1++;

            }
        }
        System.out.println("Count" + count1++);


        int sum1 = 0,n2=6;
        for (int i = 1; i <= 10; i++) {
            if (n2 % i == 0) {
                sum1 = sum1 + i;
            }

        }
        System.out.println("  sum :" + sum1);

    }

}

