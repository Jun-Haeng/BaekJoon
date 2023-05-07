import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- > 0) {
            HashSet<Integer> set = new HashSet<>();

            String str = in.next();

            for (int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i) - '0');
            }

            System.out.println(set.size());
        }
    }
}