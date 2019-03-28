package za.co.investec.addressparser.serviceImpl;

import za.co.investec.addressparser.domain.Address;
import za.co.investec.addressparser.domain.AddressLineDetail;
import za.co.investec.addressparser.domain.Type;
import za.co.investec.addressparser.service.AddressService;
import za.co.investec.addressparser.service.AddressValidator;
import za.co.investec.exception.InvalidAddressException;

import java.util.List;

public class AddressServiceImpl implements AddressService {


    @Override
    public String prettyPrintAddress(Address address) {
        //isValid(address);
        StringBuilder sb = new StringBuilder();
        sb.append("Address Details \n");
        sb.append( address.getType().getName() + " : ");

        if(address.getAddressLineDetail() != null) {
            if (address.getAddressLineDetail().getLine1() != null && !address.getAddressLineDetail().getLine1().isEmpty())
                sb.append(address.getAddressLineDetail().getLine1() );
            if (address.getAddressLineDetail().getLine2() != null && !address.getAddressLineDetail().getLine2().isEmpty())
                sb.append("  - " + address.getAddressLineDetail().getLine2() );
        }

        sb.append(" - " + address.getCityOrTown());

        if(address.getProvinceOrState() != null)
            sb.append(" - " + address.getProvinceOrState().getName() );

        sb.append(" - " + address.getPostalCode());
        sb.append(" - " + address.getCountry().getName());

        return sb.toString();
    }

    @Override
    public boolean isValid(Address address) throws InvalidAddressException {
        AddressValidator addressValidator = new AddressValidatorImpl();

        if (!addressValidator.isNumericPostalCode(address.getPostalCode())) {
            throw new InvalidAddressException("Postal code must be numeric.");
        }

        if (!addressValidator.hasCountry(address.getCountry())) {
            throw new InvalidAddressException("Country code is required, please specify the country for the address.");
        }

        if (!addressValidator.hasProvince(address)) {
            throw new InvalidAddressException("Province is required for Country code ZA.");
        }

        if (addressValidator.hasAddressLineDetails(address.getAddressLineDetail())) {
            throw new InvalidAddressException("Address Lines not specified.");
        }

        return true;
    }


    @Override
    public void prettyPrintAllAddressesInFile(List<Address> addrList) {
        for (Address address : addrList) {
            System.out.println(prettyPrintAddress(address));
        }
    }

    @Override
    public void printAddressOfType(Type addressType, List<Address> addrList) {
        for(Address address : addrList){
            if(addressType.getCode().equalsIgnoreCase(address.getType().getCode()))
                System.out.println(prettyPrintAddress(address));
        }

    }

}
