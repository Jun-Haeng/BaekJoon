import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            System.out.println(solve(str));
        }
    }

    static String solve(String str) {

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            switch (str.charAt(i)) {
                case '<':
                    if (!stack1.isEmpty()) stack2.push(stack1.pop());
                    break;

                case '>':
                    if (!stack2.isEmpty()) stack1.push(stack2.pop());
                    break;

                case '-':
                    if (!stack1.isEmpty()) stack1.pop();
                    break;

                default:
                    stack1.push(str.charAt(i));
                    break;
            }
        }

        while (!stack2.isEmpty()) stack1.push(stack2.pop());

        for (Character character : stack1) {
            sb.append(character);
        }

        return sb.toString();
    }
}