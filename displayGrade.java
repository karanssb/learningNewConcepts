public class displayGrade {
    public static void main(String[] args) {
        int m1 = 40, m2 = 90, m3 = 40;
        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            int avg = (m1 + m2 + m3) / 3;
            if (avg >= 75)
            {
                System.out.println("Got Distinction");
            } else if (avg >= 60 && avg <= 74)
            {
                System.out.println("Got first grade");
            } else if (avg >= 50 && avg <= 59)
            {
                System.out.println("Got second grade");
            } else
            {
                System.out.println("Got Third grade");
            }

        }
    }
}
