import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String nowFormatter = now.format(formatter);
        System.out.println(nowFormatter);
    }
}