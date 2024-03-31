
package Introduction;

public  class VariableDemo {
    public static void main(String[] args) {
        // byte range is -128 to 127
        byte value1 = 100;
        System.out.println("Byte value stored is "+ value1);

        //short range is -32768 to 32767
        short value2 = -327;
        System.out.println("Short value stored is "+ value2);

        //int range is -2147483648 to 2147483647
        int value3 = 999999999;
        System.out.println("integer value stored is "+ value3);
        System.out.println("integer range min  value is "+ Integer.MIN_VALUE);
        System.out.println("Integer range max value is "+ Integer.MAX_VALUE);

        //Long range is -9223372036854775808 to 9223372036854775807
        long value4 = 100;
        System.out.println("Long value stored is "+ value4);
        System.out.println("Long range min value is "+ Long.MIN_VALUE);
        System.out.println("Long range Max value is "+ Long.MAX_VALUE);

        //Float range is 1.4E-45 to 3.4028235E38
        float value5 = 100.30F;
        System.out.println("Float value stored is "+ value5);
        System.out.println("Float range min value is "+ Float.MIN_VALUE);
        System.out.println("Float range max value is "+ Float.MAX_VALUE);

        //Double range is 4.9E-324 to  1.7976931348623257E308
        double value6 = 100.30D;
        System.out.println("double value stored is "+ value6);
        System.out.println("Double range min value is "+ Double.MIN_VALUE);
        System.out.println("Double range max value is "+ Double.MAX_VALUE);

    }
}