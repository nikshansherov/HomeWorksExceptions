import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeToFile(String[] words){
        String str = "";
        for (int i = 0; i < words.length; i++){
            str = str + "<" + words[i] + ">";
        }

        File f = new File(words[0] + ".txt");
        if(!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try(FileWriter writer = new FileWriter(f, true)){
            writer.write(str + "\n");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
