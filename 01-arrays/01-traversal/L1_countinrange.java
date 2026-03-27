// ═══════════════════════════════════════════════
// Problem  : Count Numbers in Range [L, R]
// Pattern  : Array Traversal — Double Condition Counter
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Element qualifies if it satisfies TWO conditions together:
// arr[i] >= L  AND  arr[i] <= R
// Both must be true — use && (AND) not || (OR).
//
// DRY RUN:
// Input: [1, 5, 3, 8, 2, 9, 4, 7],  L=3, R=7
//
//  i=0 → arr[0]=1  3<=1<=7? No  (1 < L)
//  i=1 → arr[1]=5  3<=5<=7? Yes → count=1
//  i=2 → arr[2]=3  3<=3<=7? Yes → count=2  (boundary L included)
//  i=3 → arr[3]=8  3<=8<=7? No  (8 > R)
//  i=4 → arr[4]=2  3<=2<=7? No  (2 < L)
//  i=5 → arr[5]=9  3<=9<=7? No  (9 > R)
//  i=6 → arr[6]=4  3<=4<=7? Yes → count=3
//  i=7 → arr[7]=7  3<=7<=7? Yes → count=4  (boundary R included)
//
// Output: 4  (elements: 5, 3, 4, 7)
//
// IMPORTANT: Boundaries are INCLUSIVE (>= L and <= R)
// Change to > L and < R if exclusive range needed.
//
// CONNECTS TO:
// • Sliding window with range constraint
// • Count pairs with sum in range [L, R]   (Prefix Sum L4)
// • Binary search: count elements in range  (Binary Search L2)
//
// TIME  : O(n)
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L1_CountInRange {

    public static int countInRange(int[] arr, int L, int R) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= L && arr[i] <= R) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 8, 2, 9, 4, 7};

        System.out.println("Test 1 [3,7]: " + countInRange(arr, 3, 7));
        // Expected: 4  (elements: 5, 3, 4, 7)

        System.out.println("Test 2 [1,9]: " + countInRange(arr, 1, 9));
        // Expected: 8  (all elements in range)

        System.out.println("Test 3 [5,5]: " + countInRange(arr, 5, 5));
        // Expected: 1  (only 5)

        System.out.println("Test 4 [10,20]: " + countInRange(arr, 10, 20));
        // Expected: 0  (none in range)

        System.out.println("Test 5 [-5,0]: " + countInRange(new int[]{-3, 0, 5, -1, 2}, -5, 0));
        // Expected: 3  (elements: -3, 0, -1)
    }
}
