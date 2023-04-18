import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr.add(in.nextInt());
        }

        Collections.sort(arr);

        for (Integer value : arr) {
            sb.append(value).append('\n');
        }

        System.out.println(sb);
    }
}