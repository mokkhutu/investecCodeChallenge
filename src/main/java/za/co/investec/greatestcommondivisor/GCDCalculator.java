package za.co.investec.greatestcommondivisor;

import java.math.BigInteger;
import java.util.Arrays;

public class GCDCalculator {

    public int highestCommonFactor(int[] numbers) {
        int maxHcf = 0;
        int i = 2;  // We start i at 2 so we can only loop if array size/length is greater than 2.

        if (numbers != null && numbers.length != 0) {
            Arrays.sort(numbers);

            if (numbers.length == 1) {
                maxHcf = numbers[0];
            }

            if (numbers.length > 1) {
                maxHcf = (new BigInteger(String.valueOf(numbers[0])).gcd(new BigInteger(String.valueOf(numbers[1])))).intValue();
            }

            while (i < numbers.length ) {
                maxHcf = (new BigInteger(String.valueOf(maxHcf)).gcd(new BigInteger(String.valueOf(numbers[i])))).intValue();
                i++;
            }

            return maxHcf;
        } else {
            return 0;
        }

    }

 }
