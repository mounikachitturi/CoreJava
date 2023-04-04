public class concate {
    public static String concateWithString(){
        String t = "Java";
        for (int i = 0; i < 10000 ; i++) {
            t = t+"tpoint";
        }
        return t;
    }
        public static String concateWithStringBuffer(){
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 10000 ; i++) {
            sb.append("tpoint");
        }
        return sb.toString();
    }
        public static void main(String args[]){
            long startTime = System.currentTimeMillis();
            concateWithString();
            System.out.println("Time taken by Concateing with String: "+(System.currentTimeMillis()-startTime)+"ms");
            startTime = System.currentTimeMillis();
            concateWithStringBuffer();
            System.out.println("Time taken by Concateing with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");

        }
    }








