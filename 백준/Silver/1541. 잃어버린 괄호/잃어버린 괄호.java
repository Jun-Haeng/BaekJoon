import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(in.nextLine(), "-");

        List<String> arr = new ArrayList<>();

        while (st.hasMoreTokens()) {
            arr.add(st.nextToken());
        }

        int res = 0;

        st = new StringTokenizer(arr.get(0), "+");

        while (st.hasMoreTokens()) {
            res += Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < arr.size(); i++) {
            int sum = 0;

            st = new StringTokenizer(arr.get(i), "+");

            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }

            res -= sum;
        }

        System.out.println(res);
        
        in.close();
    }
}