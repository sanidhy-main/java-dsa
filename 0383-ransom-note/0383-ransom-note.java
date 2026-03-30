class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        for (int i = 0; i < magazine.length(); i++) {
            if (map.containsKey(magazine.charAt(i))) {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            } else {
                map.put(magazine.charAt(i), 1);
            }
        }

        for (int j = 0; j < ransomNote.length(); j++) {
            if (map.containsKey(ransomNote.charAt(j))) {
                map.put(ransomNote.charAt(j), map.get(ransomNote.charAt(j)) - 1);
            } else {
                return false;
            }
        }

        for (int value : map.values()) {
            if (value < 0) {
                return false;
            }
        }

        return true;

    }
}