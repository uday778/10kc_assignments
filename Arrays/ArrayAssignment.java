public class ArrayAssignment {
    public static void main(String[] args) {
        
        // 1. Integer array using for loop
        int[] intArray = {10, 20, 30};
        System.out.println("Integer array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // 2. String array using foreach loop
        String[] names = {"John", "Alice", "Bob", "Emma"};
        System.out.println("\nString array:");
        for (String name : names) {
            System.out.println(name);
        }

        // 3. Double array using for loop
        double[] doubleArray = {10.5, 20.75, 30.25};
        System.out.println("\nDouble array:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }

        // 4. Character array using foreach loop
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("\nCharacter array:");
        for (char ch : charArray) {
            System.out.println(ch);
        }

        // 5. Boolean array using for loop
        boolean[] boolArray = {true, false};
        System.out.println("\nBoolean array:");
        for (int i = 0; i < boolArray.length; i++) {
            System.out.println(boolArray[i]);
        }

        // 6. Integer array using foreach loop
        int[] moreInts = {5, 15, 25, 35, 45};
        System.out.println("\nMore Integers:");
        for (int num : moreInts) {
            System.out.println(num);
        }

        // 7. String array with city names using for loop
        String[] cities = {"Delhi", "Mumbai", "Chennai"};
        System.out.println("\nCity names:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }

        // 8. Float array using foreach loop
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f};
        System.out.println("\nFloat array:");
        for (float value : floatArray) {
            System.out.println(value);
        }

        // 9. Long array using for loop
        long[] longArray = {100000L, 200000L, 300000L};
        System.out.println("\nLong array:");
        for (int i = 0; i < longArray.length; i++) {
            System.out.println(longArray[i]);
        }

        // 10. Short array using foreach loop
        short[] shortArray = {100, 200, 300, 400};
        System.out.println("\nShort array:");
        for (short s : shortArray) {
            System.out.println(s);
        }
    }
}
