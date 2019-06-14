package rocks.zipcode.assessment2.fundamentals;
import java.lang.Character;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding  - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder repeat = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            repeat.append(stringToBeRepeated);
        }
        return repeat.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        char[] chars = string.toCharArray();
        for (char c : chars) {
            if (Character.isAlphabetic(c) && (!Character.toString(c).equals(" "))) {
            } return true;
        } return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        for (int i = 0; i < string.length(); i++) {
            if ("1234567890".contains(Character.valueOf(string.charAt(i)).toString())) {
                continue;
            } else { return false;
            }
        } return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
     public static boolean isSpecialCharacterString(String string) {
         char[] chars = string.toCharArray();
         for (char c : chars) {
             if (isAlphaString(string) || isNumericString(string) || Character.isAlphabetic(c) || Character.isDigit(c)) {
                 return false;
             }
         }return true;
    }
}




