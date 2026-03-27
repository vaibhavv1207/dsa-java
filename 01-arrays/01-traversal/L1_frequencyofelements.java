// ═══════════════════════════════════════════════
// Problem  : Frequency of Each Element
// Pattern  : Array Traversal — Frequency Array
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Count how many times each element appears.
//
// TWO APPROACHES:
// 1. Frequency Array  → when values are in range [0, MAX]
//    Use arr[value] as index into a count array.
//    Time: O(n), Space: O(MAX)
//
// 2. HashMap          → when values can be anything
//    Use value as key, count as value.
//    Time: O(n), Space: O(n)
//
// This problem is the DIRECT foundation for:
// • Find most/least frequent element (L2)
// • Count duplicates                 (L2)
// • HashMap problems                 (Pattern 5)
// • Sliding window frequency windows (Pattern 3 L3)
//
// DRY RUN (Frequency Array approach):
// Input: [1, 3, 2, 1, 3, 3, 4],  values in range [1, 4]
//
//  freq = [0, 0, 0, 0, 0]   (size = max+1 = 5)
//  i=0 → arr[0]=1 → freq[1]++ → freq=[0,1,0,0,0]
//  i=1 → arr[1]=3 → freq[3]++ → freq=[0,1,0,1,0]
//  i=2 → arr[2]=2 → freq[2]++ → freq=[0,1,1,1,0]
//  i=3 → arr[3]=1 → freq[1]++ → freq=[0,2,1,1,0]
//  i=4 → arr[4]=3 → freq[3]++ → freq=[0,2,1,2,0]
//  i=5 → arr[5]=3 → freq[3]++ → freq=[0,2,1,3,0]
//  i=6 → arr[6]=4 → freq[4]++ → freq=[0,2,1,3,1]
//
// Output:
//  1 → 2 times
//  2 → 1 time
//  3 → 3 times
//  4 → 1 time
//
// TIME  : O(n)
// SPACE : O(MAX) for freq array, O(n) for HashMap
// ═══════════════════════════════════════════════

import java.util.HashMap;
import java.util.Map;

public class L1_FrequencyOfElements {

    // ── Method 1: Frequency Array (values 0 to MAX) ──
    public static void frequencyArray(int[] arr, int max) {
        int[] freq = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        System.out.println("  Frequencies:");
        for (int i = 0; i <= max; i++) {
            if (freq[i] > 0) {
                System.out.println("    " + i + " → " + freq[i] + " time(s)");
            }
        }
    }

    // ── Method 2: HashMap (any values including negatives) ──
    public static void frequencyHashMap(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("  Frequencies:");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println("    " + entry.getKey() + " → " + entry.getValue() + " time(s)");
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 2, 1, 3, 3, 4};
        System.out.println("Test 1 (Freq Array, max=4):");
        frequencyArray(arr1, 4);
        // Expected: 1→2, 2→1, 3→3, 4→1

        System.out.println("\nTest 2 (HashMap — handles any values):");
        int[] arr2 = {-1, 2, -1, 3, 2, 2};
        frequencyHashMap(arr2);
        // Expected: -1→2, 2→3, 3→1

        System.out.println("\nTest 3 (all same):");
        frequencyHashMap(new int[]{5, 5, 5, 5});
        // Expected: 5→4
    }
}
