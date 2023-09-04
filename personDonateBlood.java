public class personDonateBlood {
    public static void main(String[] args) {
     char gen ='M';
     int age=23, wei=45;
     if (gen=='M' && age>=18 && age<=55 && wei>=50 && wei <=85) {
         System.out.println("can donnate");
     } else {
         System.out.println("cannot donate");
     }

      if (gen=='M') {
          if (age>=18 && age<=55){
              if (wei>=55 && wei<=85){
                  System.out.println("Blood can be donated");
              }else {
                  System.out.println("under weight blood cannot be donated");
              }

          }else {
              System.out.println("under age cannot donate");
          }
      }
      else {
          System.out.println("Gender is not male so cannot donate");
      }

    }
}
