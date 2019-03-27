import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import za.co.investec.greatestcommondivisor.GCDCalculator;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GCDCalculatorTest {

    private GCDCalculator gcdCalculator;

    public GCDCalculatorTest() {
    }

    @BeforeAll
    public void instantiateCalculator() {
        gcdCalculator = new GCDCalculator();
    }

    @Test
    public void testEmptyArray() {
        int arr[]={};
        int expectedResult = 0;
        int testResult = gcdCalculator.highestCommonFactor(arr);
        Assertions.assertEquals(testResult, expectedResult);

    }

    @Test
    public void testPositiveArray() {
        int arr[]={9,21,12,15,27};
        int testResult = gcdCalculator.highestCommonFactor(arr);
        System.out.println("Greatest Common Divisor is : " + testResult);
    }

    @Test
    public void testNegativeArray() {
        int arr[]={-9,-21,-12,-15,-27};
        int testResult = gcdCalculator.highestCommonFactor(arr);
        System.out.println("Greatest Common Divisor is : " + testResult);
    }

    @Test
    public void testNullArray() {
        int arr[]= null;
        int expectedResult = 0;
        int testResult = gcdCalculator.highestCommonFactor(arr);
        Assertions.assertEquals(testResult, expectedResult);
    }

    @Test
    public void testLengthOneArray() {
        int arr[]={1};
        int expectedResult = 1;
        int testResult = gcdCalculator.highestCommonFactor(arr);
        Assertions.assertEquals(testResult, expectedResult);
    }


}
