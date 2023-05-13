import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] arr1 = new String[N];
        String[] arr2 = new String[N];

        for (int i = 0; i < N; i++) {
            arr1[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            arr2[i] = br.readLine();
        }

        String[] arr3 = new String[N];
        for (int i = 0; i < arr1.length; i++) {
            String tmp = "";
            for (int j = 0; j < arr1[i].length(); j++) {
                tmp += arr1[i].charAt(j);
                tmp += arr1[i].charAt(j);
            }
            arr3[i] = tmp;
        }

        boolean flag = true;

        for (int i = 0; i < arr3.length; i++) {
            if (!arr3[i].equals(arr2[i])) {
               flag = false;
               break;
            }
        }

        if (flag) System.out.println("Eyfa");
        else System.out.println("Not Eyfa");
    }
}