import java.util.Scanner;

public class LeapYear {
    public static void main(String args[ ]) {
        // создаем объект для чтения из консоли
        Scanner scan = new Scanner(System.in);
        // читаем год из консоли
        int year = scan.nextInt();
        // выводим результат проверки - является ли он високосным
        System.out.println(isLeapYear(year));
    }

    // метод проверяет - является ли год високосным (true если да)
    public static boolean isLeapYear(int year) {
        // год является високосным, если он делится на 4 и (не делится на 100 или делится на 400)
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
