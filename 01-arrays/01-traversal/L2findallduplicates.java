// ═══════════════════════════════════════════════
// Problem  : Find All Duplicate Elements
// Pattern  : Array Traversal — Frequency Map
// Level    : L2 — Decision Making
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Build a frequency map first.
// Then collect all elements where frequency > 1.
//
// BONUS — O(1) Space Trick (index negation):
// If values are in range [1, n], use the array itself
// as the frequency map by negating arr[abs(arr[i])-1].
// If a position is already negative when we visit it,
// the corresponding value is a duplicate.
//
// DRY RUN (HashMap):
// Input: [4, 3, 2, 7, 8, 2, 3, 1]
//
//  freq: {4:1, 3:2, 2:2, 7:1, 8:1, 1:1}
//  duplicates: [3, 2]   (freq > 1)
//
// DRY RUN (Index Negation — O(1) space):
// Input: [4, 3, 2, 7, 8, 2, 3, 1]
//
//  i=0: val=4,  idx=3,  arr[3]=7   → negate → arr[3]=-7
//  i=1: val=3,  idx=2,  arr[2]=2   → negate → arr[2]=-2
//  i=2: val=2,  idx=1,  arr[1]=3   → negate → arr[1]=-3
//  i=3: val=7,  idx=6,  arr[6]=3   → negate → arr[6]=-3
//  i=4: val=8,  idx=7,  arr[7]=1   → negate → arr[7]=-1
//  i=5: val=2,  idx=1,  arr[1]=-3  → NEGATIVE! → 2 is duplicate
//  i=6: val=3,  idx=2,  arr[2]=-2  → NEGATIVE! → 3 is duplicate
//  i=7: val=1,  idx=0,  arr[0]=4   → negate → arr[0]=-4
//
//  Duplicates: [2, 3]
//
// TIME  : O(n) both approaches
// SPACE : O(n) HashMap,  O(1) index negation
// ═══════════════════════════════════════════════

import java.util.*;

public class L2_FindAllDuplicates {

    // ── Approach 1: HashMap ──────────────────────
    public static List<Integer> findDuplicatesHashMap(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() > 1) result.add(e.getKey());
        }
        return result;
    }

    // ── Approach 2: Index Negation O(1) space ───
    // Works ONLY when values are in range [1, n]
    public static List<Integer> findDuplicatesIndexNegation(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int idx = Math.abs(arr[i]) - 1;          // map value to index
            if (arr[idx] < 0) {
                result.add(Math.abs(arr[i]));         // already negative → duplicate
            } else {
                arr[idx] = -arr[idx];                 // mark as visited
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Test 1 (HashMap)         : " + findDuplicatesHashMap(arr1));
        System.out.println("Test 1 (Index Negation)  : " + findDuplicatesIndexNegation(arr1.clone()));
        // Expected: [2, 3]

        int[] arr2 = {1, 1, 2};
        System.out.println("\nTest 2 (HashMap)         : " + findDuplicatesHashMap(arr2));
        System.out.println("Test 2 (Index Negation)  : " + findDuplicatesIndexNegation(arr2.clone()));
        // Expected: [1]

        int[] arr3 = {1, 2, 3};
        System.out.println("\nTest 3 (no duplicates)   : " + findDuplicatesHashMap(arr3));
        // Expected: []
    }
}
