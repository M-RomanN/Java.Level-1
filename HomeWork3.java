package lesson3;

import java.util.*;


public class HomeWork3 {

    public static void main(String[] args) {

        getModifiedArrayIsTen();
        getArrayFromOneToHundred();
        multiplyNumbersLessThanSixByTwo();
        createSquareTwoDimensionalIntegerArray();
        createArray(7, 5);
        findMinAndMax(7, 30);
        checkBalance(new int[]{2, 3, 1, 2});
        trend(new int[]{1, 2, 3, 4, 5}, -4);


    }


    private static void test() {
        int[] arr = {1, 1, 5};
        int sum = Arrays.stream(arr).sum();
        if (sum % 2 == 0) {
            System.out.println("число чётное");
        } else {
            System.out.println("число нечётное");
        }
        ;
        System.out.println(sum);

    }


    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void getModifiedArrayIsTen() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    private static void getArrayFromOneToHundred() {
        int[] arr = new int[100];
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void multiplyNumbersLessThanSixByTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], …, [n][n];
    private static void createSquareTwoDimensionalIntegerArray() {
        int[][] arr = new int[9][9];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i == arr.length - (j + 1)) {
                    arr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    private static void createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }


    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
    private static void findMinAndMax(int length, int value) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(value);
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальное элемент массива': " + arr[0]);
        System.out.println("Максимальное элемент массива: " + arr[arr.length - 1]);

    }


    /*
    // 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место,
    // в котором сумма левой и правой части массива равны.
    // **Примеры: checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1 checkBalance([1, 1, 1, ||| 2, 1]) → true,
    т.е. 1 + 1 + 1 = 2 + 1 граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
    */
    public static boolean checkBalance(int[] arr) {

        int sum = Arrays.stream(arr).sum();
        int leftSum = 0;
        int halfSum = sum / 2;
        System.out.println(leftSum);
        if (sum % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                leftSum += arr[i];
                System.out.println(halfSum);

                if (leftSum == halfSum) {
                    return true;
                }
            }
        } else {
            return false;
        }

        return false;
    }


    /*
    8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
     при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
     Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
     */
    private static void trend(int[] array, int n) {
        int shiftNumber = n % array.length;
        if (shiftNumber < 0) {
            shiftToTheLeft(array, shiftNumber);
        } else {
            shiftToTheRight(array, shiftNumber);
        }
        System.out.println(Arrays.toString(array) + "; сдвиг = " + n);
    }

    private static void shiftToTheLeft(int[] array, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            int firstValue = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstValue;
        }
    }

    private static void shiftToTheRight(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int lastValue = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastValue;
        }
    }

}