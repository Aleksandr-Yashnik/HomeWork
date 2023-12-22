import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class HomeWork14Test {
    @Test
    public void findMaxCorrect() {
        int number = Integer.MAX_VALUE;
        int result = HomeWork14.findMax();
        boolean expected = (result > number);

        Assertions.assertFalse(expected);
    }

    @Test
    public void testFindIncorrectMax() {
        int number = Integer.MIN_VALUE;
        int result = HomeWork14.findMax();
        boolean expected = (result < number);

        Assertions.assertFalse(expected);
    }

    @Test
    public void testFindLongestWordCorrectResult() {
        String longestWord = "qwertyt";
        String expendet = "ttttttt";
        String result = HomeWork14.findLongestWord();
        Assertions.assertEquals(expendet, result);
    }

    @Test
    public void testFindLongestWordIncorrectResult() {
        String longestWord = "";
        String expendet = "ttttttt";
        String result = HomeWork14.findLongestWord();
        Assertions.assertEquals(expendet, result);
    }

    @Test
    public void testCorrectCalculateBMI() {
        double weight = 2;
        double height = 8;
        double expendet = weight / (height * height);
        ;
        double result = HomeWork14.calculateBMI();
        Assertions.assertEquals(expendet, result);
    }
    @Test
    public void testConvertSecondsToFormattedTime() {
        int seconds = 33000;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int sec = seconds % 60;
        String expendet = String.format("%02d:%02d:%02d", hours, minutes, sec);
        String result = HomeWork14.convertSecondsToFormattedTime();
        Assertions.assertEquals(expendet, result);
    }
}
