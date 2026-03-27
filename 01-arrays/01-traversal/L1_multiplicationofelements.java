// ═══════════════════════════════════════════════
// Problem  : Multiplication of All Elements
// Pattern  : Array Traversal — Running Product
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Same as sum, but multiply instead of add.
// Start product = 1 (not 0, because 0 × anything = 0).
//
// IMPORTANT EDGE CASES:
// • Any zero in array  → product = 0
// • All negatives (even count) → product is positive
// • All negatives (odd count)  → product is negative
// • Overflow risk for large arrays → use long
//
// DRY RUN:
// Input: [2, 3, 4, 5]
//
//  product = 1   (start)
//  i=0 → product = 1 × 2  = 2
//  i=1 → product = 2 × 3  = 6
//  i=2 → product = 6 × 4  = 24
//  i=3 → product = 24 × 5 = 120
//
// Output: 120
//
// CONNECTS TO:
// • Product of array except self (L4) — builds on this
// • Sliding window product         — window-based version
//
// TIME  : O(n)
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L1_MultiplicationOfElements {

    public static long multiply(int[] arr) {
        long product = 1;                    // long to avoid overflow
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public static void main(String[] args) {

        System.out.println("Test 1: " + multiply(new int[]{2, 3, 4, 5}));
        // Expected: 120

        System.out.println("Test 2: " + multiply(new int[]{1, 2, 3, 0, 5}));
        // Expected: 0  (zero in array)

        System.out.println("Test 3: " + multiply(new int[]{-2, 3, -4}));
        // Expected: 24  (even negatives → positive)

        System.out.println("Test 4: " + multiply(new int[]{-2, -3, -4}));
        // Expected: -24  (odd negatives → negative)

        System.out.println("Test 5: " + multiply(new int[]{7}));
        // Expected: 7
    }
}
