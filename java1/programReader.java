import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class programReader{
    public static void main(String[] args) throws IOException{
        File file = new File("./sample.txt");
        if(!file.exists())
           file.createNewFile();

    FileReader fr=new FileReader(file);
    int asciiCode;
    String text = new String();
    while((asciiCode=fr.read()) !=-1){
        text +=String.valueOf((char)asciiCode);
        System.out.println((char)asciiCode);
    }
    System.out.println(text);
    fr.close();
           
    }

}