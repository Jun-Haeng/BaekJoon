import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String A = in.next();
        String B = in.next();

        String ans1 = "";
        String ans2 = "";
        String ans3 = "";
        String ans4 = "";

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '6') ans3 += '5';
            else ans3 += A.charAt(i);
        }

        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == '6') ans4 += '5';
            else ans4 += B.charAt(i);
        }

        System.out.print(Integer.parseInt(ans3) + Integer.parseInt(ans4));
        System.out.print(" ");

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '5') ans1 += '6';
            else ans1 += A.charAt(i);
        }

        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == '5') ans2 += '6';
            else ans2 += B.charAt(i);
        }

        System.out.print(Integer.parseInt(ans1) + Integer.parseInt(ans2));
    }
}