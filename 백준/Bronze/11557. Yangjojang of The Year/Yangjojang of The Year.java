import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            int max = 0;

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");

                String university = st.nextToken();
                int soju = Integer.parseInt(st.nextToken());

                map.put(university, map.getOrDefault(university, 0) + soju);
                max = Math.max(max, soju);
            }

            for (String s : map.keySet()) {
                if (map.get(s) == max) System.out.println(s);
            }
        }
    }
}