import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();

        String res = "";

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);

            if ( (c - '0') >= 0 && (c - '0') <= 9) continue;
            else res += c;
        }

        if (res.contains(str2)) System.out.println(1);
        else System.out.println(0);
    }
}