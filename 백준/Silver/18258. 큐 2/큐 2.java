import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static Deque<Integer> q = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            String str = st.nextToken();
            int tmp = 0;

            if (st.hasMoreTokens()) tmp = Integer.parseInt(st.nextToken());

            if (str.equals("push")) push(tmp);
            else if (str.equals("pop")) pop();
            else if (str.equals("size")) size();
            else if (str.equals("empty")) empty();
            else if (str.equals("front")) front();
            else back();
        }

        System.out.println(sb);
    }

    static void push(int X) {
        q.add(X);
    }

    static void pop() {
        if (q.isEmpty()) sb.append("-1").append('\n');
        else sb.append(q.poll()).append('\n');
    }

    static void size() {
        sb.append(q.size()).append('\n');
    }

    static void empty() {
        if (q.isEmpty()) sb.append("1").append('\n');
        else sb.append("0").append('\n');
    }

    static void front() {
        if (q.isEmpty()) sb.append("-1").append('\n');
        else sb.append(q.peek()).append('\n');
    }

    static void back() {
        if (q.isEmpty()) sb.append("-1").append('\n');
        else sb.append(q.getLast()).append('\n');
    }
}