import java.util.BitSet; // Ensure correct import

public class BitSetExample {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet(); // No need for a size parameter

        // Set some bits
        bitSet.set(2);
        bitSet.set(4);
        bitSet.set(7);

        // Check if a bit is set
        System.out.println("Bit at position 2: " + bitSet.get(2)); // true
        System.out.println("Bit at position 5: " + bitSet.get(5)); // false

        // Flip a bit
        bitSet.flip(5);
        System.out.println("Bit at position 5 after flipping: " + bitSet.get(5)); // true

        // Count set bits
        System.out.println("Number of set bits: " + bitSet.cardinality());

        // Print all set bits
        System.out.println("BitSet: " + bitSet);
    }
}

