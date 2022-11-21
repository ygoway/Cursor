package HomeWork7;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        StringMethods text = new StringMethods();
        Scanner scanner = new Scanner(System.in);
        String scanString;
        System.out.println("Enter your text");
        scanString = scanner.nextLine();

        text.lettersAndCountFillings(scanString);
        text.countOfLetters(scanString);
        text.countOfGaps(scanString);
        text.countOfDigits(scanString);
        text.countOfPunctuationMarks(scanString);
    }
}
