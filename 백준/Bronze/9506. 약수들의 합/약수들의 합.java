import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            int n = in.nextInt();

            if (n == -1) break;

            List<Integer> arr = new ArrayList<>();

            for (int i = 1; i < n; i++) {
                if (n % i == 0) arr.add(i);
            }

            int sum = 0;

            for (int i = 0; i < arr.size(); i++) {
                sum += arr.get(i);
            }

            if (sum == n) {
                for (int i = 0; i < arr.size(); i++) {
                    if (i == 0) System.out.print(n + " = 1");
                    else System.out.print(" + " + arr.get(i));
                }
            }

            else System.out.print(n + " is NOT perfect.");

            System.out.println();
        }

        in.close();

    }
}