import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int n1 = Math.abs(o1);
            int n2 = Math.abs(o2);

            if (n1 > n2) return n1 - n2;
            else if (n1 == n2) return o1 - o2;
            else return -1;
        });

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            int c = Integer.parseInt(br.readLine());

            if (c == 0) {
                if (pq.size() == 0) System.out.println(0);
                else System.out.println(pq.poll());
            } else {
                pq.add(c);
            }
        }
    }
}