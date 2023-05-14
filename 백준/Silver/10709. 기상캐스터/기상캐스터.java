import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 0; i < a; i++) {
            String cloud = br.readLine();

            for (int j = 0; j < b; j++) {
                if (cloud.charAt(j) == 'c') System.out.print("0 ");
                else {
                    if (j == 0) System.out.print("-1 ");
                    else {
                        boolean flag = true;
                        for (int k = j - 1; k >= 0; k--) {
                            if (cloud.charAt(k) == 'c') {
                                flag = false;
                                System.out.print(j - k + " ");
                                break;
                            }
                        }

                        if (flag) System.out.print("-1 ");
                    }
                }
            }
            System.out.println();
        }
    }
}