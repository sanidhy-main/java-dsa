class Solution {
    public String longestCommonPrefix(String[] strs) {
        String reference = strs[0];
        int result = 0;
        int min = reference.length();

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < Math.min(strs[0].length(), strs[i].length()); j++) {
                if (reference.charAt(j) == strs[i].charAt(j)) {
                    result++;
                } else {
                    break;
                }
            }
            
            min = Math.min(min, result);
            result = 0;
            }

        return reference.substring(0, min);
    }
}
