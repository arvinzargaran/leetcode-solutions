import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count up characters from s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Count down characters from t
        for (int j = 0; j < t.length(); j++) {
            char d = t.charAt(j);
            map.put(d, map.getOrDefault(d, 0) - 1);
        }

        // If all counts are zero, it's an anagram
        for (int val : map.values()) {
            if (val != 0) return false;
        }

        return true;
    }
}