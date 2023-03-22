import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int k = in.nextInt();

            if (k == 0) break;

            int[] arr = new int[k];
            int[] numArr = new int[6];
            boolean[] visited = new boolean[k];

            for (int i = 0; i < k; i++) {
                arr[i] = in.nextInt();
            }

            dfs(arr, numArr, visited, 0, 0);
            System.out.println();
        }
    }

    private static void dfs(int[] arr, int[] numArr, boolean[] visited, int at, int depth) {
        if (depth == 6) {
            for (int val : numArr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = at; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                numArr[depth] = arr[i];
                dfs(arr, numArr, visited, i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }
}