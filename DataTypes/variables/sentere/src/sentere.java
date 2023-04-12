import java.util.Scanner;

public class sentere {
    public static void main(String args[]) {
        String str = "how are hi you you are ok hi you seem hi tired";
        String searchWord = "are";
        String[] words = str.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(searchWord)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
