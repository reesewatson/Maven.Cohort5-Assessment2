package rocks.zipcode.assessment2.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {

    private Integer monthNumber;
    private String monthName;

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

    Map<Integer, String> month = new TreeMap();

    public void add(Integer monthNumber, String monthName) {

        if (isValidNumber(monthNumber) && isValidNumber(monthNumber)) {
            month.put(monthNumber, monthName);
        }
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

        if (isValidNumber(monthNumber)) {
             return month.get(monthNumber);
        } return null;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        if (isValidMonth(monthName)) {
            for (Map.Entry<Integer, String> e : month.entrySet()) {
                if (e.getValue().equals(monthName)) {
                    return e.getKey();
                }
            }
        } return -1;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {

        if (monthNumber > 0 && monthNumber < 12) {
            return true;
        } return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        for (Map.Entry<Integer, String> entry : month.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (monthName.equals(value)) {
                return true;
            }
        } return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return month.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

        month.put(monthNumber, monthName);
    }
}
