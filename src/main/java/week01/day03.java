package week01;

public class day03 {
    public static void main(String[] args) {
        // Запуск задачи по номеру из аргументов (1, 2, 3, 4)
        if (args.length > 0) {
            switch (args[0]) {
                case "1" -> runTask1_3();
                case "2" -> runTask2_3();
                case "3" -> runTask3_3();
                case "4" -> runTask4_3();
                default -> System.out.println("Используй: java day01 1|2|3|4");
            }
        } else {
            // Если аргументов нет, запускай первую по умолчанию
            runTask1_3();
        }
    }

    //1. Числа от 1 до 100
    // Вывести только числа, которые делятся на 3.
    public static void runTask1_3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    //Найти сумму всех чисел от 1 до 100.
    //Потом изменить программу:
    // сумма только чётных чисел.

    public static void runTask2_3() {
        int sum = 0;
        // int i = 1;
        //  do {
        //     if (i % 2 == 0)
        //         sum = sum + i;
        //     i++;
        //  }
        // while(i<=100);
        for (int i = 2; i <= 100; i += 2) {
            sum = sum + i;
        }

        System.out.println(sum);
    }

    //Факториал
    //Например:
    //       5 → 120
    // Потому что:
    //       1 × 2 × 3 × 4 × 5 = 120
    public static void runTask3_3() {
        int factorial = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }

    // Простое число
    //Проверить:
    //   7 → true
    //   8 → false
    //     13 → true
    //     15 → false
    public static void runTask4_3() {
        int n = 49;
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n > 1 && n % i == 0) {
                isPrime = false;
                break;
            }

        }
        System.out.println(isPrime);
    }
}
