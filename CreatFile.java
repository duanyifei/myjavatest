import java.io.*;

public class CreatFile{
    public static void main(String [] args) throws IOException,FileNotFoundException{
        System.out.println("Usage:\n\tjava CreatFile test.txt test");
        OutputStream os = new FileOutputStream(args[0]);
        os.write(args[1].getBytes());
    }
}
