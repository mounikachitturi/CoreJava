import java.util.Locale;
import java.util.Scanner;

public class repeword {
    public static void main(String[] args){
        String str = "hi how are you you are ok you seen tired";
        String words[] = str.split(" ");
        int count = 1;
        for(int i=0 ; i< words.length ; i++){
            for (int j = i+1; j < words.length ; j++) {
                if (words[i].equals(words[j]))
                {
                    count = count+1;
                    words[j] = " 0 ";
                }
            }
            if (words[i]!= "0")
                System.out.println(words[i] + "--"+ count);
                 count=1;
        }
    }
}
