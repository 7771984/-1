// Вывести все простые числа от 1 до 1000

public class Задание_2 {
public static void main(String[] args) {

    int n = 1000;

nextPrime:
for (int i = 2; i <= n; i++) {

  for (int j = 2; j < i; j++) { 
    if (i % j == 0) continue nextPrime;
  }

System.out.println(i);}
}
}