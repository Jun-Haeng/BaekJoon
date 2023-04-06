import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Comparator<String> comparator = Comparator.reverseOrder();

        Map<String, Integer> map = new TreeMap<>(comparator);

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            String str = st.nextToken();
            if (st.nextToken().equals("enter")) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            } else map.remove(str);
        }


        for (String s : map.keySet()) {
            System.out.println(s);
        }
    }
}