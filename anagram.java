import java.util.HashMap;

public class anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> cs = new HashMap<>();
        HashMap<Character, Integer> ct = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            cs.put(s.charAt(i), cs.getOrDefault(s.charAt(i), 0) + 1);
            ct.put(t.charAt(i), ct.getOrDefault(t.charAt(i), 0) + 1);
        }

        return cs.equals(ct);
    } 

    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        System.out.println(isAnagram(s, t)); 

/* Link : https://neetcode.io/problems/is-anagram?list=neetcode150
   Approach : Using Hash Maps, add each letter in the Hash Map as a key and their frequency as values and then do content matching.
   Time Complexity: O(n+m) 
   Space Complexity: O(1)
*/
}
