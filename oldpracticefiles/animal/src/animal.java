 //             class animal { void eat() {System.out.println("eating");} }
    //         class Dog extends animal { void bark() {System.out.println("barking");}}
   //         class BabyDog extends Dog { void weep() {System.out.println("weeping");}}
   //             class Testinherience{ public static void main(String args[]){
   //                 BabyDog d = new BabyDog();d.weep();d.bark();d.eat();}}
//        class animal{ void eat() {System.out.println("eating");}class Dog extends animal{void bark()
 //    {System.out.println("barking");}}class Cat extends Dog{void meow(){System.out.println("meowing");}}class Testinheritence{
 //   public static void main(String args[]) {Cat c = new Cat();c.meow();c.bark();c.eat();}}

//     class animal{ void eat(){System.out.println("eating");}}class Dog{ void bark(){System.out.println("barking");}}
 //      class Cat extends   Dog{public static void main(String args[]){Cat obj=new Cat();obj.eat();}}

 import javax.swing.plaf.nimbus.State;

 //      class animal{ int square(int n){return  n*n;}}class circle{
//    animal an;double pi=3.14;double area(int radius){an =new animal();int rsquare = an.square(radius);return pi*rsquare;}
//    public static void main(String args[]){circle c =new circle();double result=c.area(5);System.out.println(result);}}
 public   class animal{
        String City,State,Country;
        public animal(String city,String State,String Country){
            this.City=City;
            this.State= State;
            this.Country=Country;
        }
 }
  class emo {
     int id;
     String name;
     animal Animal;

     public emo(int id, String name, animal Animal) {
         this.id = id;
         this.name = name;
         this.Animal = Animal;
     }

     void display() {
         System.out.println(id + " " + name);
         System.out.println(Animal.City + " " + Animal.State + " " + Animal.Country);
     }

     public static void main(String args[]) {
         animal Animal1 = new animal("gpa", "up", "india");
         animal Animal2 = new animal("fhe", "up", "india");

         emo e1 = new emo(11, "kavya", Animal1);
         emo e2 = new emo(12, "vinay", Animal2);
         e1.display();
         e2.display();
     }
 }









