// Вычислить сумму чисел от 1 до n

import java.util.Scanner;
public class Задание_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();
            long sumN = 0;
            for (int i = 1; i <= n; i++) {
                sumN = sumN + i;
            }
            System.out.println("Сумма чисел: " + sumN);
        }
    }  
}     


/*
// Вычислить n! произведение чисел от 1 до n

 import java.util.Scanner;

 public class Задание_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;}
            System.out.println("Сумма чисел: " + result);
            }
    } 
}
*/