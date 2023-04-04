import java.util.Scanner;
public class COMPSTR {
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int length1 = s1.length();
        int length2 = s2.length();
        int i = 1;
        if (length1 == length2) {
            char ch1 = s1.charAt(0);
            char ch2 = s2.charAt(0);
        }
        int ch1,ch2;
            for (int j = 1; j <= s1.length(); j++) {
                ch1 = s1.charAt(j);
                ch2 = s2.charAt(j);
                if (ch1 == ch2) {
                    i++;
                }
                if (i == length1) System.out.println("true");
                else if (i != length1) {
                    System.out.println("false");
                }
            }
        }
}
