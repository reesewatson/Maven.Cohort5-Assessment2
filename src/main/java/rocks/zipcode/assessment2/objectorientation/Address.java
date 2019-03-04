package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipcode;

    public Address() {
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
    }

    public String getAddressLine1() {

        return null;
    }

    public void setAddressLine1(String addressLine1) {
    }

    public String getAddressLine2() {
        return null;
    }

    public void setAddressLine2(String addressLine2) {
    }

    public String getCity() {
        return null;
    }

    public void setCity(String city) {
    }

    public String getState() {
        return null;
    }

    public void setState(String state) {
    }

    public String getZipcode() {
        return null;
    }

    public void setZipcode(String zipcode) {
    }

    @Override
    public boolean equals(Object o) {
        return (Boolean)null;
    }
}
