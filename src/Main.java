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
        String[] listOfDir = {"C:/JD_Games/src", "C:/JD_Games/res",
                "C:/JD_Games/savegames", "C:/JD_Games/temp",
                "C:/JD_Games/src/main", "C:/JD_Games/src/test",
                "C:/JD_Games/res/drawables", "C:/JD_Games/res/vectors", "C:/JD_Games/res/icons"}
        for (String dirPath : listOfDir) {
            createDir(dirPath);
        }
        createFile("C:/JD_Games/src/main/Main.java");
        createFile("C:/JD_Games/src/main/Utils.java");
        File tempTxt = createFile("C:/JD_Games/temp/temp.txt");
        FileWriter fileWriter = new FileWriter(tempTxt);
        fileWriter.write(String.valueOf(log));
        fileWriter.close();
    }
}
