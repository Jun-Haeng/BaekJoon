import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            boolean flag = false;
            ArrayList<Integer> arr = new ArrayList<>();
            while (st.hasMoreTokens()) {
                int tmp = Integer.parseInt(st.nextToken());
                if (tmp == -1) flag = true;

                arr.add(tmp);
            }

            if (flag) break;

            Collections.sort(arr);

            int cnt = 0;
            for (int i = 0; i < arr.size(); i++) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (arr.get(j) == 2 * arr.get(i)) {
                        cnt++;
                        break;
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}