public class PRICE {
    public static void main(String[] args)
    {
//            Scanner my_scan=new Scanner(System.in);
//            int age= my_scan.nextInt();
//            System.out.println(" age:" + age);
//
//            int ticketprice = 500;
//            System.out.println("ticketprice:" + ticketprice);
//            System.out.println("acuual ticketprice with console");
//            int percentagevalue= age.nextInt();
//            System.out.println("percentagevalue");


        System.out.println(calculateTicketPriceWithConcession(13, 500));
        System.out.println(calculateTicketPriceWithConcession(0, 500));
        System.out.println(calculateTicketPriceWithConcession(3, 500));
        System.out.println(calculateTicketPriceWithConcession(50, 500));
        System.out.println(calculateTicketPriceWithConcession(65, 500));

        int[] ages = { 13, 0, 3, 50, 65 };
        double totalprice = 0;
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            double ticketPrice = calculateTicketPriceWithConcession(age, 500);
            totalprice = totalprice + ticketPrice;
        }

        System.out.println("total price : " + totalprice);


    }
    public static double calculateTicketPriceWithConcession(int age, int ticketPrice) {
       if (age < 5)
            return 0;
           if (age >= 6 && age <= 15)
            return ((50.0/100.0) * ticketPrice);
            if (age >= 16 && age <= 55)
            return ticketPrice;
            if (age >= 56)
            return ((70.0 / 100.0) * ticketPrice);
         return 0;
      }

}

