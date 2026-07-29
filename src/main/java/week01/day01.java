package week01;

public class day01 {

    public static void main(String[] args) {
        // Запуск задачи по номеру из аргументов (1, 2, 3, 4)
        if (args.length > 0) {
            switch (args[0]) {
                case "1" -> runTask1();
                case "2" -> runTask2();
                case "3" -> runTask3();
                case "4" -> runTask4();
                default -> System.out.println("Используй: java day01 1|2|3|4");
            }
        } else {
            // Если аргументов нет, запускай первую по умолчанию
            runTask1();
        }
    }

    // Задача 1.
    // Дано количество секунд: 3671
    // Вывести: 1 час 1 минута 11 секунд
    public static void runTask1() {
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_MINUTE = 60;

        int totalSeconds = 3671;
        int hours = totalSeconds / SECONDS_IN_HOUR;
        int minutes = (totalSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        int seconds = totalSeconds % SECONDS_IN_MINUTE;

        // Для числа 3671 вывод будет точно соответствовать заданию
        System.out.println(hours + " час " + minutes + " минута " + seconds + " секунд");
    }

    //Задача 2.
//Дано:
//int a = 17;
//int b = 5;
//Вывести:
//сумма
//разность
//произведение
//целая часть деления
//остаток
//
    public static void runTask2() {
int a = 17;
int b = 5;

        System.out.println("Сумма: " + (a+b));
        System.out.println("Разность: " + (a-b));
        System.out.println("Произведение: " + (a*b));
        System.out.println("Целая часть деления: " + (a/b));
        System.out.println("Остаток деления: " + (a%b));
    }
    //Задача 3.
//Дан возраст человека.
//Определить:
//меньше 18 → false
//18 и больше → true
//
    public static void runTask3() {
        int age =18;
        boolean isadult = age >=18;

        System.out.println(isadult);
    }
    //Задача 4.
//Даны три числа.
//Найти:
//    • сумму;
//    • среднее арифметическое;
//    • максимальное;
//    • минимальное.
    public static void runTask4() {
        int[] numbers = {3, 5, 11};
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; numbers.length > i; i++) {

            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

            System.out.println("Сумма: "+ sum);
        System.out.println("Среднее арифметическое: "+ (double)sum/ numbers.length);
        System.out.println("Максимальное: "+ max);
        System.out.println("Минимальное: "+ min);
    }
}
