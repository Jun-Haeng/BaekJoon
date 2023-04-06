import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String key = st.nextToken();

            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            String key = st.nextToken();

            sb.append(hashMap.getOrDefault(key, 0)).append(" ");
        }

        System.out.println(sb);

    }
}