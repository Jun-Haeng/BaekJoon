
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        int size = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(') {
                stack.push('(');
                continue;
            }

            if (str.charAt(i) == ')') {
                char c = stack.pop();

                if (str.charAt(i - 1) == '(') size += stack.size();
                else size++;
            }

        }

        System.out.println(size);
    }
}