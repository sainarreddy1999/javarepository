import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class programWriter{
    public static void main(String[] args) throws IOException{
        File file = new File("./sample.txt");
        if(file.exists())
            file.delete();
        file.createNewFile();
        String s="Hello";
        FileWriter fw=new FileWriter(file);
        fw.write(s);
        fw.flush();
        fw.close();
    }
}