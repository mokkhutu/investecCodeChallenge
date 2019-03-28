# investecCodeChallenge

QUESTION 1

Find the highest common factor (https://en.wikipedia.org/wiki/Greatest_common_divisor) for a given array of integers
// example Java function definition
public int highestCommonFactor(int[] numbers) {
// your code here
}

ANSWER: 
The answer is provided in za.co.investec.greatestcommondivisor.GCDCalcualtor.java. There is also a JUnit test to test different scenarios 
in GCDCalculatorTest.java.

 
Given the attached addresses.json file which contains an array of address, do the following:

QUESTION 2
Write a function to return a pretty print version of an address in the format: Type: Line details - city - province/state - postal code – country
// example Java function definition
public String prettyPrintAddress(Address address) {
// your code here
}

ANSWER:
Please look at za.co.investec.addressparser.serviceImpl.AddressServiceImpl.java, method: prettyPrintAddress. Run AddressParserTest.java, 
@test testPrettyPrintAddress() for Results

QUESTION 2
Write a function to pretty print all the addresses in the attached file

ANSWER:
Please look at za.co.investec.addressparser.serviceImpl.AddressServiceImpl.java, method: prettyPrintAllAddressesInFile. Run AddressParserTest.java, 
@test testPrettyPrintAllAddressesInFile() for Results


Write a function to print an address of a certain type (postal, physical, business)

ANSWER:
Please look at za.co.investec.addressparser.serviceImpl.AddressServiceImpl.java, method: printAddressOfType. Run AddressParserTest.java, 
@test testPrintAddressOfType() for Results

QUESTION 2
Write a function to validate an address
  i.    A valid address must consist of a numeric postal code, a country, and at least one address line that is not blank or null. If the country is ZA, 
  then a province is required as well.
For each address in the attached file, determine if it is valid or not, and if not give an indication of what is invalid in a message format of your choice.

ANSWER:
Please look at za.co.investec.addressparser.serviceImpl.AddressServiceImpl.java, method: isValid. Run AddressParserTest.java, 
@test testIsValidAddressess() for Results
