import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        String[] nameArr = new String[N + 1];

        for (int i = 1; i < N + 1; i++) {
            String str = br.readLine();

            map.put(str, i);
            nameArr[i] = str;
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();

            if (isInteger(str)) {
                sb.append(nameArr[Integer.parseInt(str)]).append('\n');

            } else sb.append(map.get(str)).append('\n');
        }

        System.out.println(sb);
    }

    public static boolean isInteger(String str) {

        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}