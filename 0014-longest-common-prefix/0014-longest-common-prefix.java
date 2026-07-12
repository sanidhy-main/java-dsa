class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;

        for (int str = 0; str < strs.length; str++) {
            if (strs[str].length() < min) {
                min = strs[str].length();
            }
        }

        for (int l = 0; l < min; l++) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[i].charAt(l) != strs[i+1].charAt(l)) {
                    min = l;
                    break;
                }
            }
        }

        return strs[0].substring(0, min);
    }
}