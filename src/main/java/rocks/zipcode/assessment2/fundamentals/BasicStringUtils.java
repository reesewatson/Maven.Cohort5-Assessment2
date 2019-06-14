package rocks.zipcode.assessment2.fundamentals;

import java.lang.Object;
import java.lang.Character;
import java.lang.String;
import java.util.*;


public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        return string1.concat(string2);
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String reversed = "";
        for (int i = string1.length() - 1; i >= 0; i--) {
            reversed += string1.charAt(i);
        }
        return reversed;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String result = reverse(string1) + reverse(string2);
        return result;
    }

    /**
     * @param string             - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        List<String> originalStringAsList = new ArrayList(Arrays.asList(string.split("")));
        List<String> charactersToRemoveAsList = new ArrayList(Arrays.asList(charactersToRemove.split("")));
        originalStringAsList.removeAll(charactersToRemoveAsList);
                    return originalStringAsList.toString().replaceAll(" ","").replaceAll("\\[", "").replaceAll("]", "").replaceAll(",","");


        }

//        String result = string.replace(charactersToRemove,"");
//        return result;}

//        StringBuffer newString = new StringBuffer(string);
//        text.replace( StartIndex,EndIndex ,String);

//        return string.substring(String newValue = "";
//            for (int i = 0; i < string.length(); i++){
//                char c = string[i];
//                if (!string.charAt(i).equals(charactersToRemove)) {
//
//                    newValue += string.charAt(i); }
//            return newValue;}


    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        return reverse(removeCharacters(string, charactersToRemove));
    }
}
