import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Top {
    int height;
    int index;

    Top(int height, int index) {
        this.height = height;
        this.index = index;
    }
}


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Top> stack = new Stack<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            int h = Integer.parseInt(st.nextToken());

            if (i == 1) {
                sb.append("0").append(" ");
                stack.push(new Top(h, i));
            } else {

                while (true) {

                    if (stack.isEmpty()) {
                        sb.append("0").append(" ");
                        stack.push(new Top(h, i));
                        break;
                    }

                    Top top = stack.peek();

                    if (top.height > h) {
                        sb.append(top.index).append(" ");
                        stack.push(new Top(h, i));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
        }

        System.out.println(sb);
    }
}
