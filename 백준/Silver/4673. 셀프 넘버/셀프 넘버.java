

public class Main {

    public static void main(String[] args) {

        boolean[] arr = new boolean[10001];

        for (int i = 2; i < 10001; i++) {
            int sum = i;
            String temp = i + "";

            char[] c = temp.toCharArray();

            for (int j = 0; j < c.length; j++) {
                sum += c[j] - '0';
            }

            if (sum >= 10001) continue;
            else arr[sum] = true;
        }

        arr[2] = true;

        for (int i = 1; i < 10001; i++) {
            if (!arr[i]) System.out.println(i);
        }
    }
}