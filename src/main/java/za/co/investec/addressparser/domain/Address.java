package za.co.investec.addressparser.domain;

public class Address {
    private Country country;

    private String lastUpdated;

    private ProvinceOrState provinceOrState;

    private String postalCode;

    private AddressLineDetail addressLineDetail;

    private String id;

    private Type type;

    private String cityOrTown;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ProvinceOrState getProvinceOrState() {
        return provinceOrState;
    }

    public void setProvinceOrState(ProvinceOrState provinceOrState) {
        this.provinceOrState = provinceOrState;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public AddressLineDetail getAddressLineDetail() {
        return addressLineDetail;
    }

    public void setAddressLineDetail(AddressLineDetail addressLineDetail) {
        this.addressLineDetail = addressLineDetail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country=" + country +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", provinceOrState=" + provinceOrState +
                ", postalCode='" + postalCode + '\'' +
                ", addressLineDetail=" + addressLineDetail +
                ", id='" + id + '\'' +
                ", type=" + type +
                ", cityOrTown='" + cityOrTown + '\'' +
                '}';
    }
}
