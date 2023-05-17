import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

//    static boolean[] prime;
    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        /**
         * 메모리 초과
         */

//        int num = (int) Math.pow(10, N);
//        prime = new boolean[num + 1];
//        prime[0] = prime[1] = true;
//
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//
//            if (!prime[i]) {
//                for (int j = i*i; j <= num; j += i) prime[j] = true;
//            }
//        }

        backTracking("", 0);
        System.out.println(sb.toString());
    }

    static void backTracking(String num, int depth) {

        if (depth == N) {

            sb.append(num).append('\n');
            return;

            /**
             * 시간 초과
             */

//            String tmp = "";
//
//            boolean flag = true;
//            for (int i = 0; i < num.length(); i++) {
//                tmp += num.charAt(i);
//
//                int is = Integer.parseInt(tmp);
//
//                for (int j = 2; j <= is / 2; j++) {
//                    if (is % j == 0) {
//                        flag = false;
//                        break;
//                    }
//                }
//            }
//
//            if (flag) System.out.println(Integer.parseInt(num));

        }

        /**
         * 다 뽑아놓고 소수인지 파악한게 아니라
         * 가지치기를 한거임.. 이런식으로 풀어야 시간초과가 안생긴다
         */

        for (int i = 1; i < 10; i++) {
            if (check(Integer.parseInt(num + i))) {
                backTracking(num + i, depth + 1);
            }
        }
    }

    static boolean check(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}