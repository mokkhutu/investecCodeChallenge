package za.co.investec.addressparser.service;

import za.co.investec.addressparser.domain.Address;
import za.co.investec.addressparser.domain.AddressLineDetail;
import za.co.investec.addressparser.domain.Country;

public interface AddressValidator {
    boolean isNumericPostalCode(String postalCd) ;
    boolean hasAddressLineDetails(AddressLineDetail addressLineDetail) ;
    boolean hasProvince(Address address) ;
    boolean hasCountry(Country country) ;
}
