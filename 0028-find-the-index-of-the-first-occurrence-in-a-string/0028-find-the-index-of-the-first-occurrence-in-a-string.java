class Solution {
    public int strStr(String haystack, String needle) {
        int result = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j;
                for (j = 1; j < needle.length(); j++) {
                    if (needle.charAt(j) != haystack.charAt(i + j)) {
                        break;
                    }
            }

            if (j == needle.length()) {
                result = i;
                break;
            }
        }
        }

        return result;
    }
}