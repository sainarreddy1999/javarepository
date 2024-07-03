import java.io.*;

public class ReadWrite{
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("First.txt");
        FileWriter fw=new FileWriter("Second.txt");
        int i=fr.read();
        while(i!=-1){
        fw.write(i);
        i=fr.read();
        }
        fr.close();
        fw.close(); 

    }

    
}