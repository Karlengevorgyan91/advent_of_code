package advent_of_code.day2;

import java.util.List;
import advent_of_code.util.Util;

public class Dive {
    public static void main(String[] args) {
        var path = "src/main/java/advent_of_code/day2/input";
        var listOfLines = Util.getFileLines(path);
        System.out.println(findFinalPosition(listOfLines));
    }

    public static Integer findFinalPosition(List<String> listOfLines) {
        var sumOfForward = 0;
        var sumOfDownUp = 0;

        for (String element : listOfLines) {
            var actionAndValue = element.split(" ");

            switch (actionAndValue[0]) {
                case "forward":
                    sumOfForward += Integer.parseInt(actionAndValue[1]);
                    break;
                case "down":
                    sumOfDownUp += Integer.parseInt(actionAndValue[1]);
                    break;
                case "up":
                    sumOfDownUp -= Integer.parseInt(actionAndValue[1]);
                    break;
            }
        }

        return sumOfForward * sumOfDownUp;
    }
}
