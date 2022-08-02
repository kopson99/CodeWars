package pl.wojtek.tasks;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringSplit {
    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s = s+ "_";
        }

        return s.split("(?<=\\G.{" + 2 + "})");
    }
}