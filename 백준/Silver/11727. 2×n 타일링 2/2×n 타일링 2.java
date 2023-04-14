import java.util.Scanner;

public class Main {
    
    // arr[i - 2] 와 arr[i -1] 부분에서 겹치는걸 생각하지 못하였다.
    // 동적계획법은 n 이 그 전 항과 어떤 관계를 갖는지 찾는거임.. 이걸 중심으로 생각

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[1001];

        arr[1] = 1;
        arr[2] = 3;

        for (int i = 3; i < 1001; i++) {
            arr[i] = (arr[i - 2] * 2 + arr[i - 1]) % 10007;
        }

        System.out.println(arr[n]);
    }
}