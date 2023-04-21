import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int start = 0;

        while (n-- > 0) {

            int num = in.nextInt();

            if (num > start) {
                for (int i = start + 1; i <= num; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }

                start = num;
            }

            else if (stack.peek() != num) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
}