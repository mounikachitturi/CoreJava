     class Employee {
      int rollno;
      String name;
      float salary;
      void insertRecords(int r,String n,float s){
          rollno = r;
          name = n;
          salary = s;
      }
      void display(){
          System.out.println(rollno+" "+name+" "+salary);
      }
    }
    public class STUDE  {
    public static void main(String args[]){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.insertRecords(101,"vansika",12000);
        e2.insertRecords(102,"alekya",13000);
        e3.insertRecords(103,"namdu",150000);
        e1.display();
        e2.display();
        e3.display();
    }

    }

