package week01;
//Создай мини-программу:
//TextAnalyzer
//Она принимает строку и умеет:
//количество символов
//количество слов
//количество гласных
//является ли палиндромом
//То есть вместо:
//main()
//   ↓
//50 строк
//получится примерно:
//main()
// ├── countCharacters()
// ├── countWords()
// ├── countVowels()
// └── isPalindrome()
public class day06 {
    public static void main(String[] args) {
        String text = "Java is not easy";

        // Вызываем методы анализа по очереди
        System.out.println("Количество символов: " + countCharacters(text));
        System.out.println("Количество слов: " + countWords(text));
        System.out.println("Количество гласных: " + countVowels(text));
        System.out.println("Является ли палиндромом: " + isPalindrome(text));
    }

    // Подсчёт символов
    public static int countCharacters(String text) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            text.charAt(i);
            sum++;
        }
        return sum;
    }

    // Подсчёт слов
    public static int countWords(String text) {
        String trimmed = text.trim();
        if (trimmed.isEmpty()) {
            return 0;
        }
        int sum = 1;
        for (int i = 1; i < trimmed.length(); i++) {
            if (trimmed.charAt(i) == ' ' && trimmed.charAt(i - 1) != ' ') {
                sum++;
            }
        }
        return sum;
    }

    // Подсчёт гласных
    public static int countVowels(String text) {
        int sum = 0;
        String aeiou = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            if (aeiou.indexOf(text.charAt(i)) >= 0) {
                sum++;
            }
        }
        return sum;
    }

    // Проверка на палиндром
    public static boolean isPalindrome(String text) {
        boolean isPalindrome = true;
        int length = text.length();
        char[] tempCharArray = new char[length];
        char[] charArray = new char[length];

        for (int i = 0; i < length; i++) {
            tempCharArray[i] = text.charAt(i);
        }

        for (int j = 0; j < length; j++) {
            charArray[j] = tempCharArray[length - 1 - j];
        }

        for (int i = 0; i < length; i++) {
            if (tempCharArray[i] != charArray[i]) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}





