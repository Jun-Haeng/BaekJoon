import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        TreeMap<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            map.put(str, 1);
        }

        int cnt = 0;

        for (int i = 0; i < M; i++) {
            String str = br.readLine();

            if (map.containsKey(str)) cnt++;
        }

        System.out.println(cnt);

    }
}