import java.util.Scanner;

public class CONTACT {
    public static void main(String args[]) {
        System.out.println("Hello User Welcome to contact Application");
        System.out.println("-------------Options------------");
        int i = 1;
        switch (i) {
            case 1:
                System.out.println(" 1 Add Contact");
                System.out.println("Enter The Details");
                String name;
                long phone;
                String personalemail;
                String address;
                String workinggmail;
                System.out.println("name = " + "phone = " + "personalemail = " + "address = " + "workinggmail = ");
                System.out.println("current 0contact");


            case 2:
                System.out.println(" 2 Update Contact");
            case 3:
                System.out.println(" 3 Remove An Existing Contact ");
            case 4:
                System.out.println(" 4 Search Contact");
            case 5:
                System.out.println(" 5 Show All Existing Contact");
            case 6:
                System.out.println(" 6 Exit");
                break;
            default:
                System.out.println("");
                break;
        }
        System.out.println("Place Enter Your Choice ");
        System.out.println();


    }
}


