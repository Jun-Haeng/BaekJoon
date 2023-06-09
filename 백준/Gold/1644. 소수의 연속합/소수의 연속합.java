import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] prime = new boolean[N+1];
        prime[1] = true;

        for (int i = 2; i * i <= N; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= N; j += i) prime[j] = true;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (!prime[i]) arr.add(i);
        }

        int cnt = 0;
        int left = 0;
        int right = 0;
        int sum = 0;

        while (true) {
            if (sum >= N) sum -= arr.get(left++);
            else if (right == arr.size()) break;
            else if (sum < N) sum += arr.get(right++);

            if (sum == N) cnt++;
        }

        System.out.println(cnt);
    }
}