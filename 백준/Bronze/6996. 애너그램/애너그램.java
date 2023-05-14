import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            String a = st.nextToken();
            String b = st.nextToken();

            if (a.length() != b.length()) {
                System.out.println(a + " & " + b + " are NOT anagrams.");
            }

            else {
                int[] arr = new int[26];
                for (int i = 0; i < a.length(); i++) {
                    arr[a.charAt(i) - 'a']++;
                    arr[b.charAt(i) - 'a']--;
                }

                boolean flag = true;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != 0)  {
                        flag = false;
                        break;
                    }
                }

                if (flag) System.out.println(a + " & " + b + " are anagrams.");
                else System.out.println(a + " & " + b + " are NOT anagrams.");
            }
        }
    }
}
