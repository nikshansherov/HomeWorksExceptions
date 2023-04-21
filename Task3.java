public class Task3 {
    public static void main(String[] args) {
        while (true){
            try {
                String str = InputData.stringInput();
                System.out.println(str);
                String[] words = ParseString.splitString(str);
                if (words.length != 6)
                    throw new InputStringException("Ошибка - несоотвествие количества введенных параметров!");
                if (!Validation.nameVerification(words[0])) {
                    System.out.println("Ошибка - недопустимый формат фамилии!");
                    continue;
                }
                if (!Validation.nameVerification(words[0])) {
                    System.out.println("Ошибка - недопустимый формат имени!");
                    continue;
                }
                if (!Validation.nameVerification(words[0])) {
                    System.out.println("Ошибка - недопустимый формат отчества!");
                    continue;
                }
                if (!Validation.checkingTheDate(words[0])){
                    System.out.println("Ошибка - недопустимый формат даты!");
                    continue;
                }
                if (!Validation.phoneVerification(words[0])){
                    System.out.println("Ошибка - недопустимый формат телефона!");
                    continue;
                }
                if (!Validation.genderVerification(words[0])) {
                    System.out.println("Ошибка - недопустимый формат пола!");
                    continue;
                }

                WriteFile.writeToFile(words);

                break;
            } catch (InputStringException e) {
                System.out.println(e);
            }
        }
    }
}
