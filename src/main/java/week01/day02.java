package week01;

public class day02 {
    public static void main(String[] args) {
        // Запуск задачи по номеру из аргументов (1, 2, 3, 4)
        if (args.length > 0) {
            switch (args[0]) {
                case "1" -> runTask2_1();
                case "2" -> runTask2_2();
                case "3" -> runTask2_3();
                case "4" -> runTask2_4();
                default -> System.out.println("Используй: java day01 1|2|3|4");
            }
        } else {
            // Если аргументов нет, запускай первую по умолчанию
            runTask2_1();
        }
    }
    //Дано число.
    //Определить:
      //      0–10 → "A"
      //      11–20 → "B"
      //      21–30 → "C"
    //Если за пределами:
     //       "Invalid"

    public static void runTask2_1() {


        int number = 25;
        if (number >= 0&& number <=10 ) {
            System.out.println("A");
        }
        else if ( number<= 20) {
            System.out.println("B");
        }
        else if ( number<= 30) {
            System.out.println("C");
        }
        else  {
            System.out.println("Invalid");
        }

    }
    //Напиши проверку:
    //является ли год високосным.
    public static void runTask2_2() {
        int year = 1900;
        if(year%4==0&&year%100!=0||year%400==0) {
            System.out.println("Високосный");
        }
            else{
                System.out.println("Не високосный");
            }
        }



    //Есть:
    //age
       //     hasPassport
    //hasTicket
    //Человек может пройти на мероприятие, если:
    //age >= 18
    //AND
    //есть паспорт
    //AND
   // есть билет
    public static void runTask2_3() {
        int age = 18;
        boolean hasPassport = true;
        boolean hasTicket = true;
        if (age >=18 && hasPassport && hasTicket){
            System.out.println("Welcome");
        }
        else {
            System.out.println("Not Welcome");
        }
    }
  //  Даны:
  //  a
   //         b
   // operator
   // Например:
   //         10
    //        5
   //         +
  //  Результат:
   //         15
   // Поддержать:
   //         +
   //         -
   //         *
   //         /
   // И обработать деление на ноль.
    public static void runTask2_4() {
        int a = 10;
        int b = 0;
        String operator = "/";

        if (operator.equals("+")) {
            System.out.println(a + " " + operator + " " + b + " = " + (a + b));
        }
        else if (operator.equals("-")) {
            System.out.println(a + " " + operator + " " + b + " = " + (a - b));
        }
        else if (operator.equals("*")) {
            System.out.println(a + " " + operator + " " + b + " = " + (a * b));
        }
        else if (operator.equals("/")&&b!=0) {
            System.out.println(a + " " + operator + " " + b + " = " + (a / b));
        }
       else if (operator.equals("/")) {
    System.out.println("Нельзя делить на ноль");
} else {
    System.out.println("Неподдерживаемый оператор: " + operator);
}
    }
}
