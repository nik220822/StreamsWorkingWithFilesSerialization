import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static StringBuilder log = new StringBuilder("log: \n\n");

    public static File createFile(String stringFile) throws IOException {
        File file = new File(stringFile);
        if (file.createNewFile()) {
            log.append(file + " created\n");
        }
        return file;
    }

    public static File createDir(String stringDir) {
        File file = new File(stringDir);
        if (file.mkdir()) {
            log.append(file + " created\n");
        }
        return file;
    }

    public static void main(String[] arg) throws IOException {
        createDir("C:/JD_Games/src");
        createDir("C:/JD_Games/res");
        createDir("C:/JD_Games/savegames");
        createDir("C:/JD_Games/temp");
        createDir("C:/JD_Games/src/main");
        createDir("C:/JD_Games/src/test");
        createFile("C:/JD_Games/src/main/Main.java");
        createFile("C:/JD_Games/src/main/Utils.java");
        createDir("C:/JD_Games/res/drawables");
        createDir("C:/JD_Games/res/vectors");
        createDir("C:/JD_Games/res/icons");
        File tempTxt = createFile("C:/JD_Games/temp/temp.txt");
        FileWriter fileWriter = new FileWriter(tempTxt);
        fileWriter.write(String.valueOf(log));
        fileWriter.close();
    }
}
