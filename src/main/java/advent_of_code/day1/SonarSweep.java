package advent_of_code.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import advent_of_code.util.Util;

public class SonarSweep {
    public static void main(String[] args) {
        var path = "src/main/java/advent_of_code/day1/input";
        var listOfLines = Util.getFileLines(path);
        var listOfNumbers = parsToInt(listOfLines);
        var countOfDepthPart1 = count_of_depth_increases_part1(listOfNumbers);
        var countOfDepthPart2 = count_of_depth_increases_part2(listOfNumbers);

        System.out.println(countOfDepthPart1);
        System.out.println(countOfDepthPart2);
    }

    public static Integer count_of_depth_increases_part2(List<Integer> depthReading) {
        var listOfSum = Util.sliding(depthReading, 3).stream()
                .map(element -> element.get(0) + element.get(1) + element.get(2)).collect(Collectors.toList());

        return Util.sliding(listOfSum, 2).stream()
                .map(element -> element.get(1) - element.get(0))
                .filter(number -> number > 0).collect(Collectors.toList()).size();
    }

    public static Integer count_of_depth_increases_part1(List<Integer> depthReading) {
        return Util.sliding(depthReading, 2).stream()
                .map(element -> element.get(1) - element.get(0))
                .filter(number -> number > 0).collect(Collectors.toList()).size();
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
