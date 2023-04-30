import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        Long sum = 0L;

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                sum += (long) (a.charAt(i) - '0') * (b.charAt(j) - '0');
            }
        }

        System.out.println(sum);
    }
}