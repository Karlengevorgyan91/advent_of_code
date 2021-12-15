package advent_of_code.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {
    public static List<String> getFileLines(String path) {
        List<String> fileReading = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(path))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                fileReading.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return fileReading;
    }
}
