import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if (o1.length() == o2.length()) {
                    int n1 = sumArr(o1);
                    int n2 = sumArr(o2);

                    if (n1 == n2) return o1.compareTo(o2);
                    else return n1 - n2;
                } else return o1.length() - o2.length();
            }

            public int sumArr(String str) {
                int sum = 0;

                for (int i = 0; i < str.length(); i++) {
                    int tmp = str.charAt(i) - '0';
                    if (tmp >= 0 && tmp <= 9) sum += tmp;
                }

                return sum;
            }
        });

        for (String s : arr) {
            System.out.println(s);
        }
    }
}