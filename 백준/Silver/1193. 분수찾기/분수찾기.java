import java.util.Scanner;

public class Main {

    /*
        풀어보려고 했는데 이해가 잘 안가서.. 결국 답보고 그냥 품
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int X = in.nextInt();

        int crossCount = 1, prevCountSum = 0;

        while (true) {

            if (X <= prevCountSum + crossCount) {

                if (crossCount % 2 == 1) {

                    System.out.println((crossCount - (X - prevCountSum - 1))
                        + "/" + (X - prevCountSum));
                    break;
                }

                else {

                    System.out.println((X - prevCountSum)
                            + "/" + (crossCount - (X - prevCountSum - 1)));
                    break;
                }
            }

            else {
                prevCountSum += crossCount;
                crossCount++;
            }
        }
    }
}