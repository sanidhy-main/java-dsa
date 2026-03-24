class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        String lowerS = s.toLowerCase();

        while (left < right) {
            if (Character.isLetterOrDigit(lowerS.charAt(left)) && Character.isLetterOrDigit(lowerS.charAt(right))) {
                if (lowerS.charAt(left) == lowerS.charAt(right)) {
                    left++;
                    right--;
                } else {
                    return false;
                }
            } else if (!Character.isLetterOrDigit(lowerS.charAt(left))) {
                left++;
            } else {
                right--;
            }
        }

        return true;
}
}