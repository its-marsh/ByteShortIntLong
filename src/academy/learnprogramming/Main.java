package academy.learnprogramming;

public class Main {

    public static void main (String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE; //32 bits, int has a "width" of 32
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); //overflow!! -> value rolls over to negative
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); //underflow!! -> value rolls over to positive

        int myMaxIntTest = 2_147_483_647; //acceptable to add underscores

        byte myMinByteValue = Byte.MIN_VALUE; //8 bits, byte has a "width" of 8
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE; //16 bits, short has a "width" of 16
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        
        long myLongValue = 100L; //L forces java to use long, otherwise it converts to int if possible
        long myMinLongValue = Long.MIN_VALUE; //64 bits, long has a width of 64
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2); // (byte) = casting to force java to recognize primitive value

        short myNewShortValue = (short) (myMinShortValue / 2); // java will try to us int as default

        byte myByteValue = 69;
        short myShortValue = 31000;
        int myIntValue = 1024;
        long myLongChallengeValue = 50000 + (10 * (myByteValue + myShortValue + myIntValue));

        System.out.println(myLongChallengeValue);
    }
}
