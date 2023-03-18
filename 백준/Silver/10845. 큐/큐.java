import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] que;
    public static int rear = 0;
    public static int front = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        que = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {

                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "front":
                    sb.append(front()).append('\n');
                    break;
                case "back":
                    sb.append(back()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int X) {
        que[rear] = X;
        rear++;
    }

    public static int pop() {
        if (rear - front == 0) return -1;
        int ans = que[front];
        que[front] = 0;
        front++;
        return ans;
    }

    public static int size() {
        return rear - front;
    }

    public static int empty() {
        if (rear - front == 0) return 1;
        return 0;
    }

    public static int front() {
        if (rear - front == 0) return -1;
        return que[front];
    }

    public static int back() {
        if (rear - front == 0) return -1;
        return que[rear - 1];
    }
}