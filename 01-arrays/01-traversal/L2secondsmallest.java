// ═══════════════════════════════════════════════
// Problem  : Find Second Smallest Element
// Pattern  : Array Traversal — Two Variable Tracking
// Level    : L2 — Decision Making
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Mirror of Second Largest — flip all comparisons.
// Track TWO variables: first (smallest) and second.
// Rules:
// • If arr[i] < first  → second = first, first = arr[i]
// • If arr[i] < second AND arr[i] != first → second = arr[i]
//
// DRY RUN:
// Input: [5, 2, 8, 1, 4, 2, 3]
//
//  first = MAX, second = MAX
//  i=0 → 5 < first(MAX)?   Yes → second=MAX, first=5
//  i=1 → 2 < first(5)?     Yes → second=5,   first=2
//  i=2 → 8 < first(2)?     No
//         8 < second(5)?    No
//  i=3 → 1 < first(2)?     Yes → second=2,   first=1
//  i=4 → 4 < first(1)?     No
//         4 < second(2)?    No
//  i=5 → 2 < first(1)?     No
//         2 < second(2)?    No  (2 == second, skip dup)
//  i=6 → 3 < first(1)?     No
//         3 < second(2)?    No
//
// Output: second = 2
//
// TIME  : O(n)
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L2_SecondSmallest {

    public static int secondSmallest(int[] arr) {
        if (arr.length < 2) return -1;

        int first  = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first  = arr[i];
            } else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second == Integer.MAX_VALUE ? -1 : second;
    }

    public static void main(String[] args) {

        System.out.println("Test 1: " + secondSmallest(new int[]{5, 2, 8, 1, 4, 2, 3}));
        // Expected: 2

        System.out.println("Test 2: " + secondSmallest(new int[]{1, 1, 1}));
        // Expected: -1  (all same)

        System.out.println("Test 3: " + secondSmallest(new int[]{3, 1}));
        // Expected: 3

        System.out.println("Test 4: " + secondSmallest(new int[]{1, 1, 2}));
        // Expected: 2   (1 is first, 2 is second — not duplicate 1)

        System.out.println("Test 5: " + secondSmallest(new int[]{5, 4, 3, 2, 1}));
        // Expected: 2
    }
}
