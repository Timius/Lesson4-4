/**
 * Created by User on 15.10.2016.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    Уважаемый пользователь!
    Данная программа после запуска выдает запрос "Введите число от 1 до 3:"
    и в зависимости от введенного числа выполняет следующие действия:
    Число 1: Выполняет следующий вывод:
            One
            Two
            Three
    Число 2: Вычисляет и выводит на экран значение формулы: цифра сотых +
            цифра 10-ов - цифра единиц + цифра десятых - цифра сотых и т.д числа 542.95281.
    Число 3: Запускает программу которая в зависимости от введенной целочисленной
            переменной отвечающей за ежемесячеый доход генерирует следующий вывод на экран:
                от 0 до 1000 - критически малый доход
                от 1000 до 5000 - средний доход
                от 5000 до 100000 - высокий доход
                от 100000 - миллионер
      */
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 3:");
        int c = in.nextInt();
        switch (c) {
            case 1:
                System.out.println("One\n" + "Two\n" + "Three");
                break;
            case 2:
                double n = 542.95281;
                double i;
                i = n * 100000;
                int s1 = (int) i / 10000000;
                i -= s1 * 10000000;
                int s2 = (int) i / 1000000;
                i = i - s2 * 1000000;  //для разнообразия другим способом вычил
                int s3 = (int) i / 100000;
                i -= s3 * 100000;
                int s4 = (int) i / 10000;
                i -= s4 * 10000;
                int s5 = (int) i / 1000;
                i -= s5 * 1000;
                int s6 = (int) i / 100;
                i -= s6 * 100;
                int s7 = (int) i / 10;
                i -= s7 * 10;
                int s8 = (int) i;
                int s = s1 - s2 + s3 - s4 + s5 - s6 + s7 - s8;
                System.out.println(s1 + "-" + s2 + "+" + s3 + "-" + s4 + "+" + s5 + "-" + s6 + "+" + s7 + "-" + s8 + "=" + s);
                break;
            case 3:
                int d = 1500;
                if (d < 1000) {
                    System.out.println("критически малый доход");
                } else if (d >= 1000 & d < 5000) {
                    System.out.println("средний доход");
                } else if (d >= 5000 & d < 100000) {
                    System.out.println("высокий доход");
                } else {
                    System.out.println("миллионер");}
                break;
            default:
                System.out.println("Неверно введенное число (вне диапазона от 1 до 3)");
                break;
        }
    }
}
