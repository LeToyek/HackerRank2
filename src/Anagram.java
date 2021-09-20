import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));

        String a = in.nextLine();
        String b = in.nextLine();

        if (a.length()!= b.length()){
            System.out.println("not Anagram");
        }else{
            String x = a.toUpperCase();
            String y = b.toUpperCase();

            char [] arrA = x.toCharArray();
            char [] arrB = y.toCharArray();

            Arrays.sort(arrA);
            Arrays.sort(arrB);

            Boolean checker = Arrays.equals(arrA,arrB);

            if (checker == true){
                System.out.println("Anagram approved");
            }else{
                System.out.println("no Anagram");
            }
        }



    }
}
