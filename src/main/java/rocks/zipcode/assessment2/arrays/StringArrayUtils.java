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

            int newLength = Math.abs(startingIndex - endingIndex);
            String[] newArray = new String[newLength];
            int spliceIndex = 0;

            for (int i = 0; i < arrayToBeSpliced.length; i++) {
                newArray[spliceIndex] = arrayToBeSpliced[i];
                spliceIndex++;}
            return newArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

        public static Integer[] rotate(Integer[] array, Integer index) {
            String[] newArray = new Integer [array.length];
            int rotatedIndex = 0;
            //copy from the index to the end of the array.
            for (int i = 0; i < index; i++) {
                rotated[rotatedIndex] = array[i];
                rotatedIndex++;}
            return rotated;
        }
    }
}
