import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A.add(in.nextInt());
        }

        for (int i = 0; i < N; i++) {
            B.add(in.nextInt());
        }

        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

        int res = 0;

        for (int i = 0; i < N; i++) {
            res += A.get(i) * B.get(i);
        }

        System.out.println(res);
    }
}