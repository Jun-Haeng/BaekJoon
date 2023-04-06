import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String S = in.nextLine();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            String str = "" + c;

            set.add(str);

            for (int j = i + 1; j < S.length(); j++) {
                str += S.charAt(j);

                set.add(str);
            }
        }

        System.out.println(set.size());
    }
}