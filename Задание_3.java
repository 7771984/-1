// Реализовать простой калькулятор (операции + - / * )

import java.util.Scanner;
public class Задание_3 {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      try (Scanner reader = new Scanner(System.in)) {
        System.out.print("Введите два числа: ");
          num1 = reader.nextDouble();
          num2 = reader.nextDouble();
          System.out.print("\nВведите операцию: (+ - / *): ");
          op = reader.next().charAt(0);
    }
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Ошибка! Введен некорректный оператор");
            return;
      }
      System.out.print("\nОтвет:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}