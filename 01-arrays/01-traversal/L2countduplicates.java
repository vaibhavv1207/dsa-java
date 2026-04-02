// ═══════════════════════════════════════════════
// Problem  : Count Duplicates in Array
// Pattern  : Array Traversal — Frequency Map
// Level    : L2 — Decision Making
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// An element is a duplicate if it appears MORE than once.
// Count how many elements have frequency > 1.
//
// TWO THINGS TO COUNT (know which one interviewer wants):
// 1. Count of DISTINCT duplicate values
//    [1, 2, 2, 3, 3, 3] → 2 (values 2 and 3 are duplicates)
// 2. Count of EXTRA occurrences
//    [1, 2, 2, 3, 3, 3] → 3 (one extra 2 + two extra 3s)
//
// DRY RUN:
// Input: [1, 2, 2, 3, 3, 3, 4]
//
//  Build freq map:
//    1 → 1,  2 → 2,  3 → 3,  4 → 1
//
//  Count distinct duplicates (freq > 1):
//    2 → freq=2 > 1 ✓  count=1
//    3 → freq=3 > 1 ✓  count=2
//  → distinctDuplicates = 2
//
//  Count extra occurrences (freq - 1 for each dup):
//    2 → 2-1 = 1 extra
//    3 → 3-1 = 2 extra
//  → extraOccurrences = 3
//
// TIME  : O(n)
// SPACE : O(n) — HashMap
// ═══════════════════════════════════════════════

import java.util.HashMap;
import java.util.Map;

public class L2_CountDuplicates {

    // ── Count distinct values that appear > once ─
    public static int countDistinctDuplicates(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int f : freq.values()) {
            if (f > 1) count++;
        }
        return count;
    }

    // ── Count total extra occurrences ────────────
    public static int countExtraOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int extra = 0;
        for (int f : freq.values()) {
            if (f > 1) extra += (f - 1);            // all beyond first are "extra"
        }
        return extra;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 3, 3, 4};
        System.out.println("Test 1 - Distinct duplicates : " + countDistinctDuplicates(arr1));
        // Expected: 2   (values 2 and 3)
        System.out.println("Test 1 - Extra occurrences   : " + countExtraOccurrences(arr1));
        // Expected: 3   (one extra 2, two extra 3s)

        int[] arr2 = {5, 5, 5, 5};
        System.out.println("\nTest 2 - Distinct duplicates : " + countDistinctDuplicates(arr2));
        // Expected: 1   (only value 5)
        System.out.println("Test 2 - Extra occurrences   : " + countExtraOccurrences(arr2));
        // Expected: 3   (three extras)

        int[] arr3 = {1, 2, 3, 4};
        System.out.println("\nTest 3 - Distinct duplicates : " + countDistinctDuplicates(arr3));
        // Expected: 0   (no duplicates)
        System.out.println("Test 3 - Extra occurrences   : " + countExtraOccurrences(arr3));
        // Expected: 0
    }
}
