import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Long> pq = new PriorityQueue<>();

        while (N-- > 0) {
            long tmp = Integer.parseInt(br.readLine());

            if (tmp == 0) {
                if (pq.size() == 0) System.out.println(0);
                else System.out.println(pq.poll());
            }

            else pq.add(tmp);
        }
    }
}