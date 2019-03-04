package rocks.zipcode.assessment2.arrays;
import java.util.Arrays;

package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

        String[] spliced = Arrays.copyOfRange(arrayToBeSpliced,startingIndex,endingIndex);
        return spliced;

//        int newLength = Math.abs(startingIndex - endingIndex);
//            String[] newArray = new String[newLength];
//            int spliceIndex = 0;
//
//            for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
//                newArray[spliceIndex] = arrayToBeSpliced[i];
//                spliceIndex++;}
//            return newArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

            String[] newArray = new String[arrayToBeSpliced.length - startingIndex];
            int splicedIndex = 0;
            for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
                newArray[splicedIndex] = arrayToBeSpliced[i];
                splicedIndex++;}
            return newArray;
        }
}
