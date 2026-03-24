class Solution {
    public String longestCommonPrefix(String[] strs) {
        String reference = strs[0];
        int result = reference.length();

        for (int i = 0; i < strs.length; i++) {
            int j = 0;
            for (j = 0; j < Math.min(reference.length(), strs[i].length()); j++) {
                if (reference.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }

            result = Math.min(result, j);
        }

        return strs[0].substring(0, result);
    }
}
