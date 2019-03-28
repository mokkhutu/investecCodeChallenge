package za.co.investec.addressparser.serviceImpl;

import org.apache.commons.lang3.StringUtils;
import za.co.investec.addressparser.domain.Address;
import za.co.investec.addressparser.domain.AddressLineDetail;
import za.co.investec.addressparser.domain.Country;
import za.co.investec.addressparser.service.AddressValidator;

public class AddressValidatorImpl implements AddressValidator {
    public static final String SOUTH_AFRICA = "ZA";

    public boolean isNumericPostalCode(String postalCd) {
        if (StringUtils.isNumeric(postalCd)) {
            return true;
        }
        return false;
    }

    public boolean hasAddressLineDetails(AddressLineDetail addressLineDetail) {
        if(addressLineDetail == null){
            return false;

        }else {
            if((addressLineDetail.getLine1() != null && addressLineDetail.getLine1().trim().isEmpty()) ||
                    (addressLineDetail.getLine2() != null && addressLineDetail.getLine2().trim().isEmpty())) {
                return true;
            }

            return false;
        }
    }

    public boolean hasProvince(Address address) {
        if(address.getCountry().getCode().equalsIgnoreCase(SOUTH_AFRICA)){
            if(address.getProvinceOrState() == null){
                return false;
            }
        }

        return true;
    }

    public boolean hasCountry(Country country) {
        if(country == null){
            return false;
        }

        return true;
    }
}
