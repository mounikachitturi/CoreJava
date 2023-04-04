
      //   {am(){System.out.println("am is created");}public static void main(String args[]){am a1 = new am();}
      //   int id;String name;am(int r, String n){id= r;name= n void display(){
      //         System.out.println(id+" "+name);}public static void main(String args[]){
      //         am a1 = new am(101,"sita");am a2 = new am(102,"ram");a1.display();a2.display();}

      //         int id;String name;int age;am(int a,String n){id = a;name = n;}am(int a,String n,int r){id = a;name = n; age = r;}
      //   void display(){System.out.println(id+" "+name+" "+age);}public static void main(String args[]){
      //        am a1 = new am(1,"kavya",10);am a2 = new am(2,"vinnu");a1.display();a2.display();}

      //      int id;String name;static String collage = "ITS";am(int a,String n){id= a;name = n;}void display(){
      //       System.out.println(id+" "+name+" "+collage);}public static void main(String args[]){
      //        am a1 = new am(11,"vinay");am a2 = new am(12,"mouni");a1.display();a2.display();}
      //  int count=0;am(){count++;System.out.println(count);
      //    }public static void main(String args[]){am a1 = new am();am a2 = new am();am a3 = new am();}
   //       int id;String name;float fee;
     //      am(int a, String n, float f) {id = a;name = n;fee = f;}void display() {
    //      System.out.println(id + " " + name + " " + fee);}}
    //      class TestThis1 { public static void main(String args[]) {
    //          am a1 = new am(11, "chitra", 12000f);am a2 = new am(12, "vinnu", 13000f);a1.display();a2.display();}

           //   public class am {
    //              int rollno;
    //              String name;
    //              float salary;
    //              am(int rollno, String name,float salary){
    //                this.rollno = rollno;
    //                this.name = name;
    //                this.salary = salary;
    //              }
    ///              void display(){
     //                 System.out.println(rollno+" "+name+" "+salary);
     //             }
     //   }
   //     class  TestThis1 {
   //         public static void main(String args[]) {
     //           am a1 = new am(10, "sita", 100f);
     //           am a2 = new am(11, "gita", 200f);
   //             a1.display();
   ///             a2.display();
   //         }
 //       }

 //             class am { void m() {System.out.println("hello m");}void n() {System.out.println("hello n");this.m();}}
   //           class TestThis1 { public static void main(String args[]) {am a1 = new am();a1.n();}}
//          class am{ am(){System.out.println("hello am");}am(int x){this();System.out.println(x);}}
//        class TestThis1{ public static void main(String args[]){am a1 = new am(10);}}

//                 class am{ am(){this(5);System.out.println("hello am");}am(int x){System.out.println(x);}}
 //             class TestThis1{ public static void main(String args[]){am a1 = new am();}}

//        class am{ int id;String course,name;float fee;am(int id,String course,String name){this.id=id;this.course=course;this.name=name;}
//            am(int id,String course,String name,float fee){this.fee=fee;this(id,course,name);}
 //           void display(){System.out.println(id+" "+course+" "+name+" "+fee);}class TestThis1{
 //              public static void main(String args[]) {am a1 = new am(11, "computer", "vinnu", 10000);
 //                  am a2 = new am(12, "electronics", "kavya", 20000);a1.display();a2.display();}}

//          class am { void M(am obj) {System.out.println("method is invoked");}void p() {M(this);}}
//           class TestThis1 { public static void main(String args[]) {am a1 = new am();a1.p();}}

 //       class am{ TestThis1 obj;am(TestThis1 obj){this.obj=obj;}void display(){System.out.println("data");}}
//         class TestThis1{ TestThis1(){int data=10;am a1=new am(this);a1.display();}
//               public static void main(String args[]){TestThis1 a= new TestThis1();}}

 //         class am{ am getam(){return this;}void meg(){
//       System.out.println("hello java");}class Test1{ public void main(String args[]){new am().getam().meg();}}}

class am {
    void m() {
        System.out.println(this);
    }

}
class TestThis1{
    public static void main(String args[]){
        am obj=new am();
        System.out.println( "Obj");
        obj.m();
    }
}
















