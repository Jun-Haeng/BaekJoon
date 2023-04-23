import java.util.Scanner;

public class Main {
    
    // 그전라운드를 신경쓸거없이 다음 라운드에는 어쩌피 숫자가 2로 나누면
    // 초기화가 되기 때문에? 말표현이 이상한데 그런느낌이기 때문에
    // 저렇게 간단히 풀수있는거
    // 짝수든 홀수던 if로 나눌필요없이 a = a / 2 + a % 2; 표현하는거 아주좋은듯..
    // 너무 어렵게만 생각했다.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int cnt = 0;

        while (a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            cnt++;
        }

        System.out.println(cnt);
    }
}