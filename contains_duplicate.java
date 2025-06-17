import java.util.HashSet;

public class contains_duplicate {
    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dupe = new HashSet<>();
        for (int i : nums) {
            if (dupe.contains(i)) {
                return true;
            } else {
                dupe.add(i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 1};
        System.out.println(hasDuplicate(test));
    }
}

/* Link : https://neetcode.io/problems/duplicate-integer?list=neetcode150
   Approach : Using Hashsets, add each element in the Hash set if not already present.
   Time Complexity: O(n) {In Hash Set, add/search/ delete --> O(1)}
   Space Complexity: O(n)
*/