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
        // если год делится нацело на 4
        if (year % 4 == 0)
            return true; // возвращаем true
        else
            return false; // в противном случае false
    }
}
