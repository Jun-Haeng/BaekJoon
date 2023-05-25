import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 우선순위 큐 내림차순으로 정렬하는거
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());

        while (N-- > 0) {
            long tmp = Long.parseLong(br.readLine());

            if (tmp == 0) {
                if (pq.size() == 0) System.out.println(0);
                else System.out.println(pq.poll());

            } else {
                pq.add(tmp);
            }
        }
    }
}