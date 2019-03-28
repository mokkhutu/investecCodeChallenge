import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import za.co.investec.addressparser.domain.Address;
import za.co.investec.addressparser.domain.AddressType;
import za.co.investec.addressparser.service.AddressService;
import za.co.investec.addressparser.serviceImpl.AddressServiceImpl;
import za.co.investec.exception.InvalidAddressException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AddressParserTest {
    List<Address> addresses;
    AddressService addressService;
    public AddressParserTest() {
    }

    @BeforeAll
    public void loadAddressesFromFile() throws Exception {
        addressService = new AddressServiceImpl();
        addresses = (List<Address>) getAddressesFromFile("addresses.json");
    }

    @Test
    public void testPrettyPrintAddress(){
        System.out.println(addressService.prettyPrintAddress(addresses.get(0)));
    }

    @Test
    public void testIsValidAddressess()  {
        for (Address address : addresses) {
            try {
                addressService.isValid(address);
            } catch (InvalidAddressException e) {
                System.out.println("Address with id " + address.getId() + "  has an error : " + e.getErrorMessage());
            }
        }
    }

    @Test
    public void testPrettyPrintAllAddressesInFile(){
        addressService.prettyPrintAllAddressesInFile(addresses);
    }

    @Test
    public void testPrintAddressOfType(){
        za.co.investec.addressparser.domain.Type type = new za.co.investec.addressparser.domain.Type();
        type.setCode(AddressType.PHYSICAL_ADDRESS.getCode());
        addressService.printAddressOfType(type,addresses);
    }

    private Collection<Address> getAddressesFromFile(String fileName) throws Exception {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getPath()));
        Gson gson = new Gson();
        Type collectionType = new TypeToken<Collection<Address>>(){}.getType();
        Collection<Address> addressList = gson.fromJson(bufferedReader, collectionType);
        return addressList;

    }

}
