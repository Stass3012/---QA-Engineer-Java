
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число a = ");
        int a = in.nextInt();
        System.out.print("Введите число b = ");
        int b = in.nextInt();
        if (a < b) {
            System.out.println("Число a = " + a + " меньше, чем число b = " +b);
        }else if (a > b) {
            System.out.println("Число a = " + a + " больше, чем число b = " +b);
        }else if (a == b) {
            System.out.printf("Число a = %d равно числу b = %d \n", a, b);

        }else {
            System.out.println("Ни одно из условий не подходит");
        }
        int sum = a +b;
        int minus = a - b;
        int del = a/b;
        int umnogenie = a * b;
            System.out.printf("Результат операций: \n сложения = %d \n вычитания = %d \n деления = %d \n умножения = %d", sum, minus, del, umnogenie);

    }
}
