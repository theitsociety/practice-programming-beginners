package module2.week1;

import java.math.BigInteger;

public class Overflow {
    public static void main(String[] args) {

//        System.out.println("max value: " + Integer.MAX_VALUE);



//        int number = 2147483647 + 1;
//        System.out.println("number is: " + number);
//
        int value = Integer.MAX_VALUE-1;

        for(int i = 0; i < 4; i++, value++) {
            System.out.println(value);
        }

        //Solution 1  - use different type
        BigInteger largeValue = new BigInteger(Integer.MAX_VALUE + "");
        for(int i = 0; i < 4; i++) {
            System.out.println(largeValue);
            largeValue = largeValue.add(BigInteger.ONE);
        }

//        Solution 2 - throw exception
        //The static method addExact() performs a normal addition, but throws an exception
        // if the operation results in an overflow or underflow:
        for(int i = 0; i < 4; i++) {
            System.out.println(value);
            value = Math.addExact(value, 1);
        }
    }
}
