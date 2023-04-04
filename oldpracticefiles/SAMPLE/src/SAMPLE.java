
    //       public  static void main(String args[]){
    //     SAMPLE a=new SAMPLE();{System.out.println(a instanceof SAMPLE);}}}
    //         public static void main(String args[]){SAMPLE a = null;{System.out.println( a instanceof SAMPLE);}}}

class SAMPLE {
}
    class dog extends SAMPLE {
        static void method(SAMPLE s) {
            if(s instanceof dog) {
                dog d = (dog) s;
                System.out.println("ok downcasting performed");
            }
        }


        public static void main(String[] args) {
            SAMPLE s = new dog();
            dog.method(s);
        }
    }
