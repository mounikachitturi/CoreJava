import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;


class contact{
    private  int name;
    public   long phone;
    private  String personalgmail;
    private  String  address;
    private  String workingemail;
    contact(int name,long phone,String personalgmail,String address,String workingemail){
        this.name=name;
        this.phone=phone;
        this.personalgmail=personalgmail;
        this.address=address;
        this.workingemail=workingemail;
    }
    public int getName(){return name;}
    public long getPhone(){return phone;}
    public String getPersonalgmail(){return personalgmail;}
    public String getAddress(){return address;}
    public String getWorkingemail(){return workingemail;}
      public String toString(){return name +" " + phone +" " + personalgmail + " " + address + " " + workingemail;}
    }
public class details {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.println("Hello User Welcome To Contact Application");
        System.out.println("-------------Option-------------");
        int ch;
        do{
            System.out.println("1.Add Contact ");
            System.out.println("2.Update a Contact ");
            System.out.println("3.Remove an existing Contact ");
            System.out.println("4.Searching An Existing Contact ");
            System.out.println("5.Show An Existing Contact ");
            System.out.println("6.Exit ");
            System.out.println("Enter Your Choice : ");
            ch = s.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter The All Details");
                    System.out.println("name : ");
                    int name = s.nextInt();
                    System.out.println("phone : ");
                    long phone = s.nextInt();
                    System.out.println("personalgmail :");
                    String personalgmail = s.nextLine();
                    System.out.println("address : ");
                    String address = s.nextLine();
                    System.out.println("workingemail");
                    String workingemail = s.nextLine();
                    contact contact = new contact(name, phone, personalgmail, address, workingemail);
                    break;
                case 2:
                    System.out.println("Please Choose the Contact form Following Option ");
                    System.out.println("1. Search Contact");
                    System.out.println("2. Select From Table");
                    System.out.println(" Press Any Key TO return To Main  Menu ");
                    System.out.println(" select the variable you want to search for the contact");
                    System.out.println();
                    System.out.println("Please enter a key word for the choose type   ");
                    System.out.println("current contact details :");
                    break;}
        }while (ch!=0);
    }
}
