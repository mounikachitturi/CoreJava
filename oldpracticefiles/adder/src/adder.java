class adder {
    //      static int add(int a,int b){return a+b;}static int add(int a,int b,int c){return a+b+c;}}
    //      class TestOverloading{ public static void main(String args[]){
    //      System.out.println (adder.add(11,11));System.out.println(adder.add(11,11,11));}}
    //         void run(){System.out.println("enter adding ");}}
    //       class sub extends adder{ public static void main(String args[]){sub s1=new sub();s1.run();}}

    //        void run(){System.out.println("running adder");}}
    //         class sub extends adder{ void run(){System.out.println("expition java");}
    //          public static void main(String args[]){sub s1=new sub();  adder s2=new adder();s2.run();s1.run();}}

    //   int getRateOfinterest() {return 7;}}class sub extends adder {int getsRateOfinterest() {
    //           return 5;}}class mul extends sub { @Overridint getRateOfinterest() {return 6;}}

//    class div extends mul { @Override int getsRateOfinterest() {return 9;}}

    //  class mod extends div { @Override int getRateOfinterest() {return 23;}}class Test1{
    //  public static void main(String args[]){sub s=new sub();mul m=new mod();div d=new div()mod m1=new mod();
    //       System.out.println("enter adder of rate of interest"+s.getRateOfinterest());
    //       System.out.println("enter sub of rate of interest"+m.getsRateOfinterest());
//        System.out.println("div is rate of interest"+d.getRateOfinterest());}}

    //      String color = "white";}class sub extends adder{ String color = "black";
    //          void printcolor(){System.out.println(color);System.out.println(super.color);}}
    //      class Test1{ public static void main(String args[]){sub s1 = new sub();s1.printcolor();}}
    //     void eat(){System.out.println("eating");}}class sub extends adder{ void eat(){System.out.println("eating");}
    //           void bark(){System.out.println("barking");}void work(){super.eat();bark();}}
    //     class Test1{ public void main(String args[]){sub s2 = new sub();s2.work();}}
    //         adder(){System.out.println("adding is creat");   }}
    //     class sub extends adder{ sub(){super();System.out.println(" substution is creat");}}
    //     class Test2{ public static void main(String args[]){sub s3=new sub();}}

    //       int speed;adder() {System.out.println("speed is "+ speed);}
    //      {speed=100;}public static void main(String args[]){adder a1 =new adder();adder a2 = new adder();}}
    //    adder(){System.out.println("present class construct");}}
    //         class sub extends adder{ sub(){super();System.out.println("child class constructor");}sub (int a){super();
    //                System.out.println("child class constructor"+a);}{System.out.println("instance initializer block is invoked");
    //                }public static void main(String args[]){sub s2= new sub();sub s3= new sub(10);}}

    //         final int speedlimit = 90;void  run(){int speedlimit = 400;}
    //         public static void main(String args[]){adder a1 = new adder();a1.run();}

    //          void run() {System.out.println("running");}class sub extends adder { void run()
    //{System.out.println("running safely with 60km");}public static void main(String args[]) {adder b = new adder();b.run();}}}


         public static void main(String args[]){
             adder a=new adder();
             {
                 System.out.println("instance of adder");
             }
         }
 }









