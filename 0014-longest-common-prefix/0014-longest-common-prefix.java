class Solution {
    public String longestCommonPrefix(String[] strs) {
        String reference = strs[0];
        int length = 0;
        int result = reference.length();

        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < Math.min(reference.length(), strs[i].length()); j++) {
                if (reference.charAt(j) != strs[i].charAt(j)) {
                    break;
                } else {
                    length += 1;
                }
            }

            result = Math.min(result, length);
            length = 0;
        }

        return reference.substring(0, result);
    }
}
