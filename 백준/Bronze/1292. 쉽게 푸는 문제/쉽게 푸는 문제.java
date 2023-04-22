import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 45; i++) {

            for (int j = 1; j <= i; j++) {
                arr.add(i);
            }
        }

        int sum = 0;

        for (int i = A - 1; i < B; i++) {
            sum += arr.get(i);
        }

        System.out.println(sum);
    }
}