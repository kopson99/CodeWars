package pl.wojtek.tasks;

import java.util.stream.IntStream;

public class Solution {

  public int solution(int number) {
    if (number < 0) {
      return 0;
    }
    return IntStream.range(1, number).filter(value -> value% 3== 0 || value% 5 ==0).sum();
  }
}