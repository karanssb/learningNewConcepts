public class printCustomerBill {
    public static void main(String[] args) {
        double bill =8000;
        if ( bill >=5000) {
            double discount =0.20* bill;
            bill = bill -discount;
        }

        System.out.println("pay bill :" + bill);
    }


}
