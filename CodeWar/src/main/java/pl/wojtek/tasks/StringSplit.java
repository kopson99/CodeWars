package pl.wojtek.tasks;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {
    public static String[] solution(String s) {

        final List<String> arrays = new ArrayList<>();

        int index = 0;
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            str.append(c);
            index++;

            if (index >=2) {
                arrays.add(str.toString());
                str = new StringBuilder();
                index = 0;

            }
        }

        if (!str.isEmpty()) {
            str.append("_");
            arrays.add(str.toString());
        }

        return arrays.toArray(new String[0]);
    }
}