import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        Stack<Long> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long res = 0;

        for (int i = 0; i < N; i++) {
            long b = Integer.parseInt(br.readLine());

            if (i == 0) stack.push(b);
            else {
                while (true) {

                    if (stack.isEmpty()) {
                        stack.push(b);
                        break;
                    }

                    if (stack.peek() > b) {
                        stack.add(b);
                        break;

                    } else {
                        stack.pop();
                    }
                }
            }

            res += stack.size() - 1;
        }

        System.out.println(res);
    }
}