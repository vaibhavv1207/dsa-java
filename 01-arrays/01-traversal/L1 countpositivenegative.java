// ═══════════════════════════════════════════════
// Problem  : Count Positive and Negative Elements
// Pattern  : Array Traversal — Conditional Counter
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Three categories exist: positive, negative, zero.
// arr[i] > 0  → positive
// arr[i] < 0  → negative
// arr[i] == 0 → zero (separate case — not positive, not negative)
//
// Common mistake: treating 0 as positive or negative.
// Always handle zero explicitly.
//
// DRY RUN:
// Input: [3, -1, 0, 7, -5, -2, 0, 4]
//
//  i=0 →  3  > 0 → pos++ → pos=1
//  i=1 → -1  < 0 → neg++ → neg=1
//  i=2 →  0  = 0 → zero++→ zero=1
//  i=3 →  7  > 0 → pos++ → pos=2
//  i=4 → -5  < 0 → neg++ → neg=2
//  i=5 → -2  < 0 → neg++ → neg=3
//  i=6 →  0  = 0 → zero++→ zero=2
//  i=7 →  4  > 0 → pos++ → pos=3
//
// Output: Positive=3, Negative=3, Zero=2
//
// REAL USE:
// This pattern directly leads to:
// • Separate negatives to left  (Two Pointers)
// • Move zeros to end           (Two Pointers)
// • Dutch National Flag         (Three categories → three pointers)
//
// TIME  : O(n)
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L1_CountPositiveNegative {

    // ── Solution ────────────────────────────────
    public static void countPosNeg(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero     = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)      positive++;
            else if (arr[i] < 0) negative++;
            else                 zero++;
        }

        System.out.println("  Positive = " + positive
                         + ", Negative = " + negative
                         + ", Zero = "     + zero);
    }

    // ── Quick Test ──────────────────────────────
    public static void main(String[] args) {

        int[] arr1 = {3, -1, 0, 7, -5, -2, 0, 4};
        System.out.print("Test 1: ");
        countPosNeg(arr1);
        // Expected: Positive=3, Negative=3, Zero=2

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.print("Test 2: ");
        countPosNeg(arr2);
        // Expected: Positive=5, Negative=0, Zero=0

        int[] arr3 = {-1, -2, -3};
        System.out.print("Test 3: ");
        countPosNeg(arr3);
        // Expected: Positive=0, Negative=3, Zero=0

        int[] arr4 = {0, 0, 0};
        System.out.print("Test 4: ");
        countPosNeg(arr4);
        // Expected: Positive=0, Negative=0, Zero=3

        int[] arr5 = {-100, 0, 100};
        System.out.print("Test 5: ");
        countPosNeg(arr5);
        // Expected: Positive=1, Negative=1, Zero=1
    }
}
