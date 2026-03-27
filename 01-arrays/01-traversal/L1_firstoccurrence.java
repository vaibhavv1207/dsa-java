// ═══════════════════════════════════════════════
// Problem  : First Occurrence of an Element
// Pattern  : Array Traversal — Break on Match
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Traverse from left to right.
// The MOMENT you find the target → return that index.
// No need to scan further — first match is the answer.
//
// KEY DIFFERENCE vs Last Occurrence:
// First → return immediately on match (break early)
// Last  → update and continue scanning (never break)
//
// DRY RUN:
// Input: [4, 2, 7, 2, 9, 2, 5],  target = 2
//
//  i=0 → arr[0]=4  == 2? No
//  i=1 → arr[1]=2  == 2? Yes → return 1  ← stops here
//
// Output: 1
//
// DRY RUN (not found):
// Input: [4, 2, 7, 2, 9],  target = 99
//
//  i=0..4 → no match found
//  loop ends → return -1
//
// CONNECTS TO:
// • Binary Search first occurrence (Binary Search L1)
// • Two pass problems: find first, then find last
// • First repeating element (HashMap L2)
//
// TIME  : O(n) worst case (not found or at end)
//         O(1) best case (found at index 0)
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L1_FirstOccurrence {

    public static int firstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;                    // found → return immediately
            }
        }
        return -1;                           // not found
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 2, 9, 2, 5};

        System.out.println("Test 1 (target=2):  " + firstOccurrence(arr, 2));
        // Expected: 1

        System.out.println("Test 2 (target=4):  " + firstOccurrence(arr, 4));
        // Expected: 0  (first element)

        System.out.println("Test 3 (target=5):  " + firstOccurrence(arr, 5));
        // Expected: 6  (last element — worst case)

        System.out.println("Test 4 (target=99): " + firstOccurrence(arr, 99));
        // Expected: -1  (not found)

        System.out.println("Test 5 (target=3):  " + firstOccurrence(new int[]{3, 3, 3, 3}, 3));
        // Expected: 0  (first index when all same)

        // Bonus — First & Last together
        System.out.println("\n-- First vs Last for target=2 --");
        System.out.println("First: " + firstOccurrence(arr, 2));   // 1
        System.out.println("Last:  " + lastOccurrence(arr, 2));     // 5
        System.out.println("Count: " + countOccurrences(arr, 2));   // 3
    }

    // Bonus helpers to show how they connect
    public static int lastOccurrence(int[] arr, int target) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) result = i;
        }
        return result;
    }

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }
        return count;
    }
}
