package pl.wojtek.tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Task4
{

    public  boolean check(String sentence){
        final Set<Character> alphabet = new HashSet<>();
        final Set<Character> alphabetToCheck = new HashSet<>();
        char letter = 'a';
        while (letter <= 'z') {
            alphabet.add(letter);
            letter++;
        }
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (alphabet.contains(c)) {
                alphabetToCheck.add(c);
            }
        }
        return alphabetToCheck.size() == 26;
    }
}
