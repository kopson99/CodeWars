package pl.wojtek.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task4Test
{
    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        Task4 pc = new Task4();
        assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        Task4 pc = new Task4();
        assertEquals(false, pc.check(pangram2));
    }
}