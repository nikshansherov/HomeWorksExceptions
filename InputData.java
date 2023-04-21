import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputData {

    public static String stringInput() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Введите строку: ");
                String str = sc.nextLine();
                sc.close();
                return str;
            } catch (NoSuchElementException | InputStringException e) {
                System.out.println(e);
            }
            sc.close();
        }
    }
}
