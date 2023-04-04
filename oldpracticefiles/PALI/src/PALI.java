import java.util.Scanner;
public class PALI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        Boolean palindrome = true;
        for (int i=0, j=A.length()-1;i<=j;i++,j--) {
            if (A.charAt(i) != A.charAt(j)) {
                palindrome = false;
            }
        }
           if (palindrome){
               System.out.println("Yes");
           }else {
               System.out.println("No");
           }

    }
}
