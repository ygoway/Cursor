package HomeWork7;

import java.util.HashMap;
import java.util.Map;

public class StringMethods {

    public void lettersAndCountFillings(String str) {
        Map<Character, Integer> map = new HashMap();
        String s = str.toLowerCase();
        String letters = s.replaceAll("[^a-z]", "");
        char[] chars = letters.toCharArray();

        for (Character character : chars) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        for (Map.Entry input : map.entrySet()) {
            System.out.println("Char : " + input.getKey() + " happens " + input.getValue() + " times.");
        }
    }

    public void countOfLetters(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(chars[i])) {
                count++;
            }
        }
        System.out.println("Count of letters : " + count);
    }

    public void countOfGaps(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == ' ') {
                count++;
            }
        }
        System.out.println("Count of gaps : " + count);
    }

    public void countOfDigits(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('0' <= chars[i] && chars[i] <= '9') {
                count++;
            }
        }
        System.out.println("Count of digits : " + count);
    }

    public void countOfPunctuationMarks(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(chars[i]) && !Character.isDigit(chars[i])
                    && !Character.isWhitespace(chars[i])) {
                count++;
            }
        }
        System.out.println("Count of punctuation marks : " + count);
    }
}
