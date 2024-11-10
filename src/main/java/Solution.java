import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> charFrequency = new HashMap<>();

        for (char c : s.toCharArray()) {
            charFrequency.merge(c, 1, Integer::sum);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charFrequency.getOrDefault(c, 0) == 1) return i;
        }

        return -1;
    }
}