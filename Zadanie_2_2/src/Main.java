//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ввидете первое слово: ");
            String str1 = in.nextLine();
        System.out.print("Ввидете второе слово: ");
            String str2 = in.nextLine();
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Строки идентичны");
        }else {
            System.out.println("Строки неидентичны");
        }

    }
}
