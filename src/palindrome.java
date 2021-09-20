import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            B += A.charAt(i);
        }
        if (B.equals(A)) {
            System.out.println("Yes");
        }
    }
}
