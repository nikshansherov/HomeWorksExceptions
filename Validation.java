import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static java.lang.Character.isLetter;

public class Validation {

    public static boolean checkingTheDate(String  str){
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = df.parse(str);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean nameVerification(String name){
        for (int i = 0; i < name.length(); i++) {
            char n = name.charAt(i);
            if (!isLetter(n)) {
                return false;
            }
        }
        return true;
    }

    public static boolean phoneVerification(String tel){
        String regex = "\\d+";
        if(tel.matches(regex)){
            return true;
        }
        return false;
    }

    public static boolean genderVerification(String gender){
        if (Objects.equals(gender, "f") | Objects.equals(gender, "m")) {
            return true;
        }
        return false;
    }
}
