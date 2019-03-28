package za.co.investec.addressparser.domain;

public enum AddressType {
    PHYSICAL_ADDRESS("1"),
    POSTAL_ADDRESS("2"),
    BUSINESS_ADDRESS("3");

    AddressType(String code){
        this.code = code;

    }

    private String code;
    public String getCode() {
        return code;
    }

}
