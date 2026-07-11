class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> occurence = new HashMap<>();

        for (int j = 0; j < s.length(); j++) {
            if (!occurence.containsKey(s.charAt(j))) {
                occurence.put(s.charAt(j), 1);
            } else {
                occurence.put(s.charAt(j), occurence.get(s.charAt(j)) + 1);
            }
        }

        for (int k = 0; k < s.length(); k++) {
            if (occurence.get(s.charAt(k)) == 1) {
                return k;
            }
        }

        return -1;
    }
}