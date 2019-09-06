import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main (String[] args){
        String line = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Migue\\Documents\\My Games\\Rocket League\\TAGame\\Launch.txt"));

            while ((line = reader.readLine()) != null) {
                if (line.contains("hunt")) {
                    System.out.println(line);
                }
            }
                reader.close();

        } catch (IOException e){}
    }
    }