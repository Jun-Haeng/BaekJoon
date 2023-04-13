import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.equals("ENTER")) set = new HashSet<>();

            else if (!set.contains(str)) {
                set.add(str);
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        for (Integer value : map.values()) {
            cnt += value;
        }

        System.out.println(cnt);
    }
}
