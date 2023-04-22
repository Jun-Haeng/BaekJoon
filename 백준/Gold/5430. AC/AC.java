import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String tmp = br.readLine();

            tmp = tmp.substring(1, tmp.length() - 1);

            Deque<Integer> deque = new ArrayDeque<>();

            StringTokenizer st = new StringTokenizer(tmp, ",");

            while (st.hasMoreTokens()) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            boolean f = true;
            int direction = 1;

            for (int j = 0; j < p.length(); j++) {

                char c = p.charAt(j);
                if (c == 'R') direction *= -1;
                else {
                    if (direction == 1) {
                        if (deque.isEmpty()) {
                            f = false;
                            break;
                        } else {
                            deque.pollFirst();
                        }

                    } else {
                        if (deque.isEmpty()) {
                            f = false;
                            break;
                        } else {
                            deque.pollLast();
                        }
                    }
                }
            }

            StringBuilder sb = new StringBuilder();

            if (f) {
                sb.append("[");

                if (deque.isEmpty()) sb.append("");

                else if (direction == 1) {
                    while (true) {
                        sb.append(deque.pollFirst());
                        if (deque.isEmpty()) break;
                        sb.append(",");
                    }
                } else {
                    while (true) {
                        sb.append(deque.pollLast());
                        if (deque.isEmpty()) break;
                        sb.append(',');
                    }
                }

                sb.append("]");

                System.out.println(sb);
            } else {
                System.out.println("error");
            }

        }
    }
}