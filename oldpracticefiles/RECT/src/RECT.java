     class TestRECT{
    int length;
    int width;
    void insert(int l,int w){
        length=l;
        width=w;
    }void claculateArea(){
             System.out.println(length*width);
         }
     }

     public class RECT {
    public static void main(String args[]){
      TestRECT r1 = new TestRECT();
      TestRECT r2 =new TestRECT();
      r1.insert(12,8);
      r2.insert(31,14);
      r1.claculateArea();
      r2.claculateArea();
    }
}
