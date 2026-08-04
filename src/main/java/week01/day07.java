package week01;

import java.util.Random;

public class day07 {
    // SimpleTestAnalyzer
    // Пусть программа принимает результаты тестов: //PASS
    //FAIL
    //PASS
    //PASS
    //SKIP
    //FAIL
    //И выдаёт:
    //Total: 6
    //Passed: 3
    //Failed: 2
    //Skipped: 1
    //Pass rate: 50%


   public static void main(String[] args) {
    int testCount = generateTestCount(); // 1. Сколько тестов?
    String[] results = generateResults(testCount); // 2. Генерируем массив
    analyzeResults(results); // 3. Анализируем и выводим
}

       // 1. Генерация количества тестов (от 5 до 10)
public static int generateTestCount() {
    Random random = new Random();
    return random.nextInt(6) + 5;
}

// 2. Создание массива с результатами
public static String[] generateResults(int count) {
    String[] options = {"PASS", "FAIL", "SKIP"};
    String[] tests = new String[count];
    Random random = new Random();

    for (int i = 0; i < count; i++) {
        tests[i] = options[random.nextInt(options.length)];
    }
    return tests;
}

// 3. Анализ и вывод
public static void analyzeResults(String[] tests) {
    int pass = 0, fail = 0, skip = 0;

    for (String result : tests) {
        if (result.equals("PASS")) pass++;
        else if (result.equals("FAIL")) fail++;
        else if (result.equals("SKIP")) skip++;
    }

    double rate = (double) pass * 100 / tests.length;

    System.out.println("Total: " + tests.length);
    System.out.println("Passed: " + pass);
    System.out.println("Failed: " + fail);
    System.out.println("Skipped: " + skip);
    System.out.printf("Pass rate: %.1f%%%n", rate);
}
    }

