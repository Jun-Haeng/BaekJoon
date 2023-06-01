import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        sb.append('<');

        int cnt = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        while (!q.isEmpty()) {

            cnt++;

            if (K == cnt) {
                arr.add(q.remove());
                cnt = 0;
            } else {
                q.add(q.remove());
            }
        }


        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) {
                sb.append(arr.get(i));
            }
            else sb.append(arr.get(i)).append(", ");
        }

        sb.append('>');

        System.out.println(sb);
    }
}