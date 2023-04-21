import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> tempStack = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            tempStack.push(Integer.parseInt(st.nextToken()));
        }

        stack.add(tempStack.pop());
        arr.add(-1);

        while (!tempStack.isEmpty()) {

            int tmp = tempStack.pop();

            while (true) {

                if (stack.isEmpty()) {
                    stack.push(tmp);
                    arr.add(-1);
                    break;
                }

                if (tmp < stack.peek()) {
                    arr.add(stack.peek());
                    stack.push(tmp);
                    break;

                } else {
                    stack.pop();
                }
            }
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            sb.append(arr.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}