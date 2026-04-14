class Solution {
    public int strStr(String haystack, String needle) {
        int result = -1;

        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 1;
                for (j = 1; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                }

                if (j == needle.length()) {
                    return i;
                }
            }
        }

        return result;
    }
}