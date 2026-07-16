class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int left = 0;
        int right = left + s1.length();
        HashMap<Character, Integer> mainMap = new HashMap<>();
        HashMap<Character, Integer> secMap = new HashMap<>();

        for (int i = 0; i < right; i++) {
            mainMap.put(s2.charAt(i), mainMap.getOrDefault(s2.charAt(i), 0) + 1);
        }

        for (int j = 0; j < s1.length(); j++) {
            secMap.put(s1.charAt(j), secMap.getOrDefault(s1.charAt(j), 0) + 1);
        }

        if (mainMap.equals(secMap)) {
                return true;
        }

        while (right < s2.length()) {
                mainMap.put(s2.charAt(left), mainMap.get(s2.charAt(left)) - 1);
                if (mainMap.get(s2.charAt(left)) == 0) {
                    mainMap.remove(s2.charAt(left));
                }

                left++;

                mainMap.put(s2.charAt(right), mainMap.getOrDefault(s2.charAt(right), 0) + 1);
                right++;

                if (mainMap.equals(secMap)) {
                    return true;
                }
        }

        return false;
    }
}