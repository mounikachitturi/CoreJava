public class MathUtils {


    public static void printTables(int number) {
        // 2 * 1 = 2
        // 2 * 2 = 4
        // ......
        // 2 * 10 = 20

            for (int i=1; i<=10; i++){
                System.out.println( number + " * " +  i  + " = " + number * i );
            }
    }


    public static void printCubesUpto(int number) {
        // 1 cube = 1
        // 2 cube = 8
        //...
        // n cube = x
        for (int i=1; i<=number; i++){
            System.out.println(i +" cube " + " = " + i*i*i);
        }
    }

    public static void printSquaresUpto(int number) {
        // 1 square = 1
         for ( int i=1; i<=number; i++){
           System.out.println(i + " square " + " = " + i*i);}

    }

    public static void printCompoundRatio(int[] arr) {
        // code
        int numeratorsMultiplied = 1;
        int denominatorMultiplied = 1;
        // { 4,3,9, 13,26, 5, 2,15 }
        for (int i = 0; i < arr.length; i = i + 2) {
            int numerator = arr[i];
            int denominator = arr[i+1];
            numeratorsMultiplied = numeratorsMultiplied * numerator;
            denominatorMultiplied = denominatorMultiplied * denominator;
        }
        System.out.println(numeratorsMultiplied + "," + denominatorMultiplied);
    }

    public static int addAllNumbersTill(int number) {
        return (number * (number + 1) / 2);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOddNumber(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDivisibleBy3(int number) {
        if (number % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDivisibleBy4(int number) {
        if (number % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean isDivisibleBy2(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean isPrime(int number) {
        if (number == 1 || number == 2) return true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int isFactorial(int number){
        int fact = 1;
        for (int i = 2; i <= number; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static boolean willItFit(int[] rectangle1,int[] rectangle2) {
        if ((getMax(rectangle1[0],rectangle1[1]) > getMax(rectangle2[0],rectangle2[1])) && (getMin(rectangle1[0],rectangle1[1]) > getMin(rectangle2[0],rectangle2[1]))) {
            return true;
        }
        return false;
    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
      public static int getMin(int c, int d) {
          if (c < d) {
              return c;
          } else {
              return d;
          }
      }

       public static double findAverage(int[] array ){
        int sum = 0;
         for (int i=0; i<array.length; i++){
             sum=sum + array[i];
         }
         double average = sum/array.length;
           return average;
       }
        public static double findAverageMedian(int[] array){
        int middle = 0/ 2;
        for(int i=0; i< array.length; i++){
            middle = middle + array[i];
        }
            float median = middle/2 ;
            return median;
    }




       }










