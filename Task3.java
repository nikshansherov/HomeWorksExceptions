
public class Task3 {
    public static void main(String[] args) {
        while (true) {
            String str = InputData.stringInput();
            String[] words = ParseString.splitString(str);
            if (words.length != 6) {
                System.out.println("Ошибка - несоотвествие количества введенных данных!");
                continue;
            }
            if (!Validation.nameVerification(words[0])) {
                System.out.println("Ошибка - фамилия должна содержать только буквы!");
                continue;
            }
            if (!Validation.nameVerification(words[1])) {
                System.out.println("Ошибка - имя должно содержать только буквы!");
                continue;
            }
            if (!Validation.nameVerification(words[2])) {
                System.out.println("Ошибка - отчество должно содержать только буквы!");
                continue;
            }
            if (!Validation.checkingTheDate(words[3])) {
                System.out.println("Ошибка - дата должна быть в формате 01.01.2000!");
                continue;
            }
            if (!Validation.phoneVerification(words[4])) {
                System.out.println("Ошибка - формат телефона должен содержать только цифры!");
                continue;
            }
            if (!Validation.genderVerification(words[5])) {
                System.out.println("Ошибка - 'пол' должен быть 'f' или 'm'!");
                continue;
            }
            WriteFile.writeToFile(words);
            break;
        }
    }
}
