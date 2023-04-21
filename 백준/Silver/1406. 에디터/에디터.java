import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack1.push(str.charAt(i));
        }

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            String s = st.nextToken();

            if (s.equals("L")) {
                if (!stack1.isEmpty()) stack2.push(stack1.pop());
            }

            else if (s.equals("D")) {
                if (!stack2.isEmpty()) stack1.push(stack2.pop());
            }

            else if (s.equals("B")) {
                if (!stack1.isEmpty()) stack1.pop();
            }

            else {
                stack1.push(st.nextToken().charAt(0));
            }
        }

        while (!stack2.isEmpty()) stack1.push(stack2.pop());

        for (Character c : stack1) {
            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}