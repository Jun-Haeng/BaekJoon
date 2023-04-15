import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> hashMap = new HashMap<>();

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine(), " ");

                String tmp = st.nextToken();
                String key = st.nextToken();

                hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
            }

            int sum = 1;

            for (Integer value : hashMap.values()) {
                sum *= (value + 1);
            }

            System.out.println(sum - 1);
        }
    }
}