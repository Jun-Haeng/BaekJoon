import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        List<Integer> arr = new ArrayList<>();
        int idx = 0;

        while (!q.isEmpty()) {

            idx = K;

            while (true) {

                if (idx == 1) {
                    arr.add(q.poll());
                    break;
                }

                idx--;
                q.add(q.poll());

            }
        }

        System.out.print("<");
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) {
                System.out.print(arr.get(i) + ">");
            } else {
                System.out.print(arr.get(i) + ", ");
            }
        }
    }
}