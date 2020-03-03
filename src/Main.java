import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main (String[] args){
        String line;
        String clutter;
        int deaths = 1;
        int adds = 1;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("G:\\Steam\\SteamApps\\common\\Hunt Showdown\\game.log"));
            while ((line = reader.readLine()) != null) {
                if (line.contains("PrepareLevel") || line.contains("eRET_MatchmakingFinished")){
                    deaths = 1;
                    adds = 1;}
                if (line.contains("eRET_PlayerAdded")) {
                    clutter = line.replace(" [Hunt Online] Lobby Event: eRET_", "");
                    System.out.println(clutter + " " + adds++);
                } else if (line.contains("eRET_PlayerRemoved")){
                    clutter = line.replace(" [Hunt Online] Lobby Event: eRET_", "");
                    System.out.println(clutter + " " + deaths++);
                } else if (line.contains("Received chat")){
                    clutter = line.replace(" [Hunt Online] Lobby Event: eRET_", "");
                    System.out.println(clutter);
                }
            }
            reader.close();
        } catch (IOException ignored){
        }
    }
}
