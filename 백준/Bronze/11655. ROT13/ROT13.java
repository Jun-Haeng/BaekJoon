import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String tmp = in.nextLine();
        String ans = "";

        for (int i = 0; i < tmp.length(); i++) {

            char c = tmp.charAt(i);
            int pos = 0;

            if (c >= 'A' && c <= 'Z') {
                pos = c - 'A';
                c = (char) (((pos + 13) % 26) + 'A');

            }

            else if (c >= 'a' && c <= 'z') {
                pos = c - 'a';
                c = (char) (((pos + 13) % 26) + 'a');
            }

            ans += c;
        }

        System.out.println(ans);
    }
}