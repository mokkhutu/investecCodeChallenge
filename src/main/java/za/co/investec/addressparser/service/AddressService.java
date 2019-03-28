package za.co.investec.addressparser.service;

import za.co.investec.addressparser.domain.Address;
import za.co.investec.addressparser.domain.Type;
import za.co.investec.exception.InvalidAddressException;

import java.util.List;

public interface AddressService {
    String prettyPrintAddress(Address address) ;
    boolean isValid(Address address) throws InvalidAddressException;
    void prettyPrintAllAddressesInFile(List<Address> addrList) ;
    void printAddressOfType(Type addressType, List<Address> addrList);
}
