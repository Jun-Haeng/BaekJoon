import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (!res.contains(arr[i])) res.add(arr[i]);
        }

        Collections.sort(res);

        for (Integer val : res) {
            System.out.print(val + " ");
        }
    }
}