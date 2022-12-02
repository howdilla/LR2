import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Lab2_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите пароль: ");

        if (scanner.hasNextLine()) {
            String password = scanner.nextLine();

            String pattern = "((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[0-9a-zA-Z_]{8,})";

            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(password);

            if ((m.matches())) {
                System.out.println("Пароль надёжный");
                System.exit(0);
            }
            else {
                System.out.println("Пароль ненадёжный");
            }
        }
    }
}
