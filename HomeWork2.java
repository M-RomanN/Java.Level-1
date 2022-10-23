package lesson2;


public class HomeWork2 {

    public static void main(String[] args) {
        between10and20(7, 2);
        positive_or_negative(10);
        positive_or_negative(0);
        more_or_less_null(-1);
        positive_or_negative(-10);
        print_str_and_int("Вывод строки № ", 1);
        boolean year = leap_years(0);
        System.out.println(year);
    }


    //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean between10and20(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    private static void positive_or_negative(int a) {
        if (a >= 0) {
            System.out.println("Передано число " + a + ". Число положительное.");
        } else {
            System.out.println("Передано число " + a + ". Число отрицательное.");

        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    private static boolean more_or_less_null(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    //    4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
    private static void print_str_and_int(String text, int i) {
        for (i = 0; i < 5; i++) {
            System.out.println(text + (i + 1));
        }
    }

    //5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static boolean leap_years(int a) {
        if (!(a % 4 == 0) || ((a % 100 == 0) && !(a % 400 == 0))) {
            return false;
        }
        return true;
    }
}


