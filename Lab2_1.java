import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Lab2_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату в формате dd/mm/yyyy: ");
        String date = scanner.nextLine();

        String pattern = "^((0[1-9])|([12][0-9])|(3[01]))/((0[0-9])|(1[012]))/((19[0-9][0-9])|([2-9][0-9][0-9][0-9]))$";
        String pattern1 = "((0[1-9])|([12][0-8]))/(02)/((19[0-9][0-9])|([2-9][0-9][0-9][0-9]))";
        String pattern2 = "((0[1-9])|([12][0-9])|(3[01]))/(01)|(03)|(05)|(07)|(08)|(10)|(12)/((19[0-9][0-9])|([2-9][0-9][0-9][0-9]))";
        String pattern3 = "((0[1-9])|([12][0-9])|(3[0]))/(04)|(06)|(09)|(11)/((19[0-9][0-9])|([2-9][0-9][0-9][0-9]))";

        Pattern p = Pattern.compile(pattern);
        Pattern p1 = Pattern.compile(pattern1);
        Pattern p2 =Pattern.compile(pattern2);
        Pattern p3 =Pattern.compile(pattern3);

        Matcher m = p.matcher(date);
        Matcher m1 = p1.matcher(date);
        Matcher m2 = p2.matcher(date);
        Matcher m3 = p3.matcher(date);

        if (!(m.matches())) {
            System.out.println("Введеное выражение не соответствует заданному формату даты dd/mm/yyyy." );
            System.exit(0);
        }

        if ((m1.matches())|(m2.matches())|(m3.matches())) {
            System.out.println("Введенное выражение является датой.");
        }

        else {
            System.out.println("Введенное выражение не является датой.");
        }
    }
}
