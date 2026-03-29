class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

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

        for (int val : map.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}