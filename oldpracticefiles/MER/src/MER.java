import java.util.Scanner;
import java.util.concurrent.atomic.LongAdder;

public class MER {
    public static void main(String args[]) {
       //int age = 25;int weight = 48; if (age >= 18) {if (weight > 50) {
         //   System.out.println("you are eligible to blood donate");
           //    } else{System.out.println("you are not eligible to blood donate");{
          //      System.out.println("age must be greater then 18");}}
     //   int r = 5;
       //     for(int i=1;i<=r;i++){
       //     for (int j = r; j >= i; j--){
        //        System.out.print(" * ");
          //  } System.out.println();}
      //    int array[] ={11,12,32,45,65,90};
      //    for (int i:array){System.out.println(i);}
     //    aa:
    //     for (int i = 1; i <=3 ; i++) {  bb:
    //         for (int j = 1; j <=3; j++) {
    //             if (i==2&&j==2){  break bb;}
    //             System.out.println(i+" "+j);}}
    //     for (int i = 1; i <=3; i++) {
    //         for (int j = 1; j <= 3; j++) {
     //            if (i==2&&j==2){  break ;}
     //       int n1=0,n2=1,n3,r,count=10;System.out.println(n1+" "+n2);
      //            for (r = 0; r < count; r++) { n3= n1+n2;System.out.println(" "+n3);n1=n2;n2=n3;}
           Scanner s = new Scanner(System.in);
           System.out.println("enter a number");
           int n = s.nextInt(); if (isPrime(n)){
               System.out.println(n+" is a prime number");}else {System.out.println(n+"is a not prime number");}
         {
          if(n<=1) {
                   return;}
          for (int i = 2; i <Math.sqrt(n) ; i++) {
            if(n%i==0){
                return;}}
           }




}}