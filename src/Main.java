import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        //1 вариант
        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + arr[30 - 1] + " рублей");
        //2 вариант
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        // 1 вариант
        int summ = 0;
        double averageSum = 0;
        for (int element : arr) {
            summ += element;
            averageSum = summ / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
        // 2 вариант
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (double) sum / arr.length + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = generateRandomArray();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
