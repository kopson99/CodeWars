package pl.wojtek.tasks;

import java.util.Arrays;

public class Task3
{
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
         Arrays.stream(phrase.split(" ")).forEach(s -> {
            stringBuilder.append(" ").append(s.substring(0, 1).toUpperCase()).append(s.substring(1));
        });
        return stringBuilder.toString().replaceFirst(" ", "");
    }
}
