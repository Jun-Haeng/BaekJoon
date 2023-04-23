import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    // 굳이 문자를 숫자로 변환하지 않고도 비교 가능함.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String pre = st.nextToken();
        String start = st.nextToken();
        String end = st.nextToken();

        Set<String> before = new HashSet<>();
        Set<String> after = new HashSet<>();
        Set<String> nameSet = new HashSet<>();

        String str = "";
        while ((str = br.readLine()) != null) {
            String[] arr = str.split(" ");

            String time = arr[0];
            String name = arr[1];

            nameSet.add(name);
            if (pre.compareTo(time) >= 0) before.add(name);
            else if (start.compareTo(time) <= 0 && end.compareTo(time) >= 0) {
                after.add(name);
            }
        }

        int cnt = 0;

        for (String name : nameSet) {
            if (before.contains(name) && after.contains(name)) cnt++;
        }

        System.out.println(cnt);
    }
}