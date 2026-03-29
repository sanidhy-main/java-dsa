class Solution {
    public String longestCommonPrefix(String[] strs) {
       String reference = strs[0];
       int current = 0;
       int result = reference.length();

       for (int i = 1; i < strs.length; i++) {
        for (int j = 0; j < Math.min(reference.length(), strs[i].length()); j++) {
            if (reference.charAt(j) != strs[i].charAt(j)) {
                break;
            }

            current++;
        }

        result = Math.min(result, current);
        current = 0;
       }

       return strs[0].substring(0, result);
    }
}
