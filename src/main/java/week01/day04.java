package week01;

public class day04 {
    public static void main(String[] args) {
    // Запуск задачи по номеру из аргументов (1, 2, 3, 4)
    if (args.length > 0) {
        switch (args[0]) {
            case "1" -> runTask1_4();
            case "2" -> runTask2_4();
            case "3" -> runTask3_4();
            case "4" -> runTask4_4();
            default -> System.out.println("Используй: java day01 1|2|3|4");
        }
    } else {
        // Если аргументов нет, запускай первую по умолчанию
        runTask1_4();
    }
}

    //Максимум
//[5, 2, 9, 1, 7]
  //  Найти максимальный элемент.
    public static void runTask1_4() {
        int numbers[] = {5, 2, 9, 1, 7};
        int max = numbers[0];
        for(int i = 0;i < numbers.length;i++){
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        System.out.println(max);
    }
    //Минимум
    //То же самое, но минимальный.
    public static void runTask2_4() {
        int numbers[] = {5, 2, 9, 1, 7};
        int min = numbers[0];
        for(int i = 0;i < numbers.length;i++){
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        System.out.println(min);
    }
    //Среднее
   // Найти среднее значение всех элементов массива.
    public static void runTask3_4() {
        int numbers[] = {5, 2, 9, 1, 7};
        int sum = 0;
        for(int i = 0;i < numbers.length;i++){
            sum+=numbers[i];
        }
        double avg = ( double)sum/numbers.length;
        System.out.println(avg);
    }
     //  Разворот
    //[1, 2, 3, 4, 5]
    //  получить:
     // [5, 4, 3, 2, 1]

    public static void runTask4_4() {
        int numbers[] = {1, 2, 3, 4, 5};
        int[] numbersReverse = new int[5];
        for(int i = 0;i < numbers.length;i++){

                numbersReverse[i] = numbers[numbers.length - i - 1];



    }

for(int i = 0; i < numbersReverse.length; i++){
    System.out.print(numbersReverse[i] + " ");
}
}
}
