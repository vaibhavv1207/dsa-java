// ═══════════════════════════════════════════════
// Problem  : Average of All Elements
// Pattern  : Array Traversal
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Average = Sum / Count
// Two things to be careful about:
// 1. Integer division truncates → use double/float
// 2. Empty array → division by zero, handle it
//
// DRY RUN:
// Input: [10, 20, 30, 40, 50]
//
//  sum = 10+20+30+40+50 = 150
//  count = 5
//  average = 150.0 / 5 = 30.0
//
// Output: 30.0
//
// COMMON MISTAKE:
// int sum = 150, int n = 5
// sum / n = 150 / 5 = 30   ← OK here
// But: sum=7, n=2
// 7 / 2 = 3 (WRONG — integer division!)
// (double)7 / 2 = 3.5 (CORRECT)
// Always cast to double before dividing.
//
// TIME  : O(n)
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L1_AverageOfElements {

    public static double average(int[] arr) {
        if (arr.length == 0) return 0.0;     // guard: empty array

        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;    // cast before dividing
    }

    public static void main(String[] args) {

        System.out.println("Test 1: " + average(new int[]{10, 20, 30, 40, 50}));
        // Expected: 30.0

        System.out.println("Test 2: " + average(new int[]{1, 2}));
        // Expected: 1.5  (not 1 — shows why cast matters)

        System.out.println("Test 3: " + average(new int[]{7}));
        // Expected: 7.0

        System.out.println("Test 4: " + average(new int[]{}));
        // Expected: 0.0  (empty array guard)

        System.out.println("Test 5: " + average(new int[]{-10, 0, 10}));
        // Expected: 0.0
    }
}
