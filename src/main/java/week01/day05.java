package week01;

public class day05 {
    public static void main(String[] args) {
    // Запуск задачи по номеру из аргументов (1, 2, 3, 4)
    if (args.length > 0) {
        switch (args[0]) {
            case "1" -> runTask1_5();
            case "2" -> runTask2_5();
            case "3" -> runTask3_5();
            case "4" -> runTask4_5();
            default -> System.out.println("Используй: java day01 1|2|3|4");
        }
    } else {
        // Если аргументов нет, запускай первую по умолчанию
        runTask1_5();
    }
}

    //Палиндром
    //level → true
    //hello → false
   public static void runTask1_5() {
    boolean isPalindrome = true;
    String word = "level";
    int length = word.length();
    char[] tempCharArray = new char[length];
    char[] charArray = new char[length];

    // Копируем символы в массив
    for (int i = 0; i < length; i++) {
        tempCharArray[i] = word.charAt(i);
    }

    // Переворачиваем массив
    for (int j = 0; j < length; j++) {
        charArray[j] = tempCharArray[length - 1 - j];
    }

    // Сравниваем оригинал с перевёрнутым
    for (int i = 0; i < length; i++) {
        if (tempCharArray[i] != charArray[i]) {
            isPalindrome = false;
            break;
        }
    }

    System.out.println(isPalindrome);
}
//"Hello World"
      //  → 3
    public static void runTask2_5() {
       String text = "Hello World";
       int sum = 0;
       String aeiou = "aeiouAEIOU";
       for(int i = 0;i < text.length();i++){

          if(aeiou.indexOf(text.charAt(i))>=0){
              sum++;
          }
       }
       System.out.println(sum);
    }
    //Количество слов
//"Java is not easy"
    //    → 4
    public static void runTask3_5() {
    String text = "Java is not easy";

    text = text.trim();
    if (text.isEmpty()) {
        System.out.println(0);
        return;
    }
    int sum = 1;
    for (int i = 1; i < text.length(); i++) {
        if (text.charAt(i) == ' ' && text.charAt(i - 1) != ' ') {
            sum++;
        }
    }

    System.out.println(sum);
}
    //Разворот строки
//"hello"
     //   →
      //  "olleh"
    public static void runTask4_5() {
    String text = "hello";
    System.out.println(new StringBuilder(text).reverse().toString());
}
}
