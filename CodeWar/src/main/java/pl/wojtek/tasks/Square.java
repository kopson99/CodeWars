package pl.wojtek.tasks;

public class Square {
    public static boolean isSquare(int n) {
        if (n < 0) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        return Math.sqrt(n) % 1 == 0;
    }
}