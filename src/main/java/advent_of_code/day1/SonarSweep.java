package advent_of_code.day1;

import java.util.ArrayList;
import java.util.List;

import advent_of_code.util.Util;

public class SonarSweep {
    public static void main(String[] args) {
        var path = "src/main/java/advent_of_code/day1/input";
        var listOfLines = Util.getFileLines(path);
        var listOfNumbers = parsToInt(listOfLines);
        var countOfDepth = count_of_depth_increases(listOfNumbers);

        System.out.println(countOfDepth);
    }

    public static Integer count_of_depth_increases(List<Integer> depthReading) {
        Integer compareNumber = depthReading.get(0);
        Integer numberOfDepth = 0;

        for (Integer nextNumberOfDepth : depthReading) {

            if (nextNumberOfDepth > compareNumber) {
                numberOfDepth++;
            }

            compareNumber = nextNumberOfDepth;
        }

        return numberOfDepth;
    }

    public static List<Integer> parsToInt(List<String> listOfString) {
        var listOfDepth = new ArrayList<Integer>();
        try {

            for (String line : listOfString) {
                var number = Integer.parseInt(line);

                listOfDepth.add(number);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return listOfDepth;
    }

}
