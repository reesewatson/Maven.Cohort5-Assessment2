package rocks.zipcode.assessment2.fundamentals;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$#" + amountOfPadding + "s", stringToBePadded); }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$-" + amountOfPadding + "s", stringToBePadded); }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder repeat = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            repeat.append(stringToBeRepeated); }
        return repeat.toString(); }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        if(string == string.toUpperCase()) {
            return true;
        } else {
            return false; } }

        /**
         * @param string - string to be evaluated
         * @return - true if string only contains numeric characters
         */
        public static Boolean isNumericString (String string){
            for (int i = 0; i < string.length(); i++) {
                if ("1234567890".contains(Character.valueOf(string.charAt(i)).toString())) {
                    continue;
                } else {
                    return false; } }
                    return true; }

            /**
             * @param string - string to be evaluated
             * @return - true if string only contains special characters
             */
            public static Boolean isSpecialCharacterString (String string){

                    String specialCharacters = " !#$%&'()*+,-./:;<=>?@[]^_`{|}~0123456789";
                    String[] specialCharactersArray = new String[string.length()];
                    for (int i = 0; i < string.length(); i++) {
                        specialCharactersArray[i] = Character
                                .toString(string.charAt(i)); }

                    int count = 0;
                    for (int i = 0; i <  specialCharactersArray.length; i++) {
                        if (specialCharacters.contains( specialCharactersArray[i])) {
                            count++; } }
                    if (string != null && count == 0) {
                        return true;
                    } else {
                        return false; } }



}
