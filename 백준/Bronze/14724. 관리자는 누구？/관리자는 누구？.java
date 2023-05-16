import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        String[] ans = {"PROBRAIN", "GROW", "ARGOS",
                "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};

        int idx = 0;
        int max = 0;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < N; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if (tmp > max) {
                    max = tmp;
                    idx = i;
                }
            }
        }

        System.out.println(ans[idx]);
    }
}