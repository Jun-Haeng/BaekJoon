import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String[] a = {"apa", "epe", "ipi", "opo", "upu"};
        String[] b = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < 5; i++) str = str.replaceAll(a[i], b[i]);

        System.out.println(str);
    }
}