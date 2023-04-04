// class subject implements Cloneable { int rollnoString name;
//   subject(int rollno, String name) public Object clone()throws CloneNotSupportedException {return super.clone();}
//  public static void main(String args[]) {try {subject C1 = new subject(12, "vinay");subject C2 =(subject)C1.clone();
// System.out.println(C1.rollno + " " + C1.name);System.out.println(C1.rollno + " " + C1.name);} catch (CloneNotSupportedException c) {}}}



public class Mathclass {
    double x = 28;
    double y = 5;
    //return maximam value

    {   System.out.println("maximam number of x and y is :"+Math.max(x,y));}
         // square value
         {
             System.out.println(" square root of y value is :"+Math.sqrt(y));
         }
         // logarithm values of x and y
         {
             System.out.println("logarithm value of x is :"+Math.log(x));
             System.out.println("logarithm value of y is"+Math.log(y));
         }
         // power value of x
         {
             System.out.println("power value of x and y is :"+Math.pow(x,y));
         }
}

