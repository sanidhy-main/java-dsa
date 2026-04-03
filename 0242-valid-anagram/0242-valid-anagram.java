class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) {
        return false;
       }

       HashMap<Character, Integer> map = new HashMap<>();

       int len = s.length();

       for (int i = 0; i < len; i++) {
        if (!map.containsKey(s.charAt(i))) {
            map.put(s.charAt(i), 1);
        } else {
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
       }

       for (int j = 0; j < len; j++) {
        if (!map.containsKey(t.charAt(j))) {
            return false;
        } else {
            map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
        }
       }

       for (int value : map.values()) {
        if (value != 0) {
            return false;
        }
       }

       return true;
    }
}