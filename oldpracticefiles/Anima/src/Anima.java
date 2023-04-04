//      class Anima { }class dog extends Anima{
//    static void method(Anima a){if (a instanceof Anima){dog d = (dog)a;System.out.println("ok downcasting performs");///        }}public static void main(String args[]){Anima a = new dog();dog.method(a);}}
//        class Anima{ }class dog2 extends Anima{ static void method(Anima a1){dog2 d = (dog2) a1;
//    System.out.println("ok downcasting performs");}public static void main(String args[]){Anima a1 = new dog2();dog2.method(a1);}}

//       interface Printable{}class A implements Printable{public void a(){System.out.println("a method");}}
 //       class B implements  Printable{ public void b(){System.out.println("b method");}}class Anima {
  //    void invoke(Printable p){if (p instanceof A) {A a = (A) p;a.a();}if (p instanceof B) {B b = (B) p;b.b();}}}
  //      class Test2{ public static void main(String args[]){Printable p = new B();Anima a = new Anima();a.invoke(p);}}

import java.security.PublicKey;

//     interface A3{ void print();}
//     class Anima implements A3 {public void print(){System.out.println("hello");}
//     public static void main(String args[]){Anima a = new Anima();a.print();}}
//        interface Anima{ void draw();}
//    class A1 implements Anima{public void draw(){System.out.println(" object drawing");}}
//     class A2 implements Anima{public void draw(){System.out.println("object creating");}} class AnimaTest{
//    public static void main(String args[]){Anima obj = new A2();Anima obj1 = new A1();obj.draw();obj1.draw();}}
//          interface Bank{ float rateOfInterest();}class SBI implements Bank { public float rateOfInterest(){return 9.15f;}}
//      class  PNB implements Bank {public float rateOfInterest(){return 4.92f;}}
//       class ADB implements Bank {public float rateOfInterest(){return 6.983f;}}
//     class Anima{public static void main(String args[]) {Bank b = new SBI();System.out.println("ROI :"+b.rateOfInterest());}}
//        interface  Protable{ void print();}interface  Showable { void show();}class Anima implements Protable,Showable{
 //           public void print(){System.out.println("hello");}public void show(){System.out.println("world");}
 //       public static void main(String args[]){Anima a1 = new Anima();a1.print();a1.show();}}
//       interface Protable{ void print();}interface Showable{ void print();}class Anima implements Protable,Showable{
//public void print(){System.out.println(" Hello");}public static void main(String args[]){Anima A1 = new Anima();A1.print();}}

//interface Protable{ void print();}interface Showable extends Protable { void show();}class Anima implements Showable
//{public void print(){System.out.println("Hello World");}public void show(){System.out.println("Welcome To India");}
//    public static void main(String args[]){Anima a2 = new Anima();a2.print();a2.show();}}
//    interface Drawble{ void draw();default void msg(){System.out.println(" Default Method");}}
//    class prot implements Drawble{ public void draw(){System.out.println("Drawing protable");}}
//        class Anima { public static void main(String args[]){Drawble d = new prot();d.draw();d.msg();}}
 interface Drawable{
     void drawa();
     static int cube(int X){ return X*X*X;}
}
class rect implements Drawable{
     public void drawa(){
         System.out.println("drawing rectangle");
     }
}
class Anima{
     public static void main(String args[]){
         Drawable d1 = new rect();
         d1.drawa();
         System.out.println(Drawable.cube(3));}
}







//