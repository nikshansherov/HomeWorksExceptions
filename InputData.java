import java.util.Scanner;

public class InputData {
    public static String stringInput() {
        while (true) {
            System.out.println("Введите данные: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (str == ""){
                System.out.println("Вы ничего не ввели, попробуйте еще!");
               continue;
            }
            return str;
        }
    }
}
