import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

import static java.lang.System.in;

public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        for (a= 0; a == b.length() - 1; a++, b++){
            System.out.println("true");
        }
        if (a.charAt(a) != b.charAt(b)) {
            System.out.println("false");
        }
    }
}
