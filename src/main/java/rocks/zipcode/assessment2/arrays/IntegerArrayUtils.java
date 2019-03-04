package rocks.zipcode.assessment2.arrays;
import java.util.Arrays;
/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray   - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {

        Integer[] newArray = Arrays.copyOf(integerArray, integerArray.length + 1);
        newArray[newArray.length - 1] = valueToBeAdded;
        return newArray;
    }

    /**
     * @param integerArray      - array to be manipulated
     * @param indexToInsertAt   - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {

        integerArray[indexToInsertAt] = valueToBeInserted;
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {

        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {

        Integer[] newArray = new Integer[integerArray.length];

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                newArray[i] = integerArray[i] = i + 1;
                i++;
            }
            for (int j = 0; j < integerArray.length; j++) {
                if (integerArray[j] % 2 != 0) {
                    newArray[j] = integerArray[j] = j - 1;
                    j++;
                }
            }
        }
        return newArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] incrementEvens = new Integer[integerArray.length];
        int index = 0;

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                incrementEvens[i] = i + 1;
                i++;
            }
        }
        return incrementEvens;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] decrementOdds = new Integer[input.length];
        int index = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                decrementOdds[i] = i - 1;
                i++;
            }
        }
        return decrementOdds;
    }
}
