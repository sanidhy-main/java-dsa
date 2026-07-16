class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = left + k;
        int count = 0;
        int maxCount = Integer.MIN_VALUE;
        ArrayList<Character> chars = new ArrayList<>();
        
        for (int i = 0; i < right; i++) {
            chars.add(s.charAt(i));
        }

        for (int x = 0; x < chars.size(); x++) {
            if (chars.get(x) == 'a' || chars.get(x) == 'e' || chars.get(x) == 'i' || chars.get(x) == 'o' || chars.get(x) == 'u') {
                count++;
            }
        }

        maxCount = Math.max(count, maxCount);

        while (left < right && right < s.length()) {
            chars.remove(left);
            if (s.charAt(left) == 'a' || s.charAt(left) == 'e' || s.charAt(left) == 'i' || s.charAt(left) == 'o' || s.charAt(left) == 'u') {
                count--;
            }

            left++;

            chars.add(s.charAt(right));
            if (s.charAt(right) == 'a' || s.charAt(right) == 'e' || s.charAt(right) == 'i' || s.charAt(right) == 'o' || s.charAt(right) == 'u') {
                count++;
            }

            chars.add(s.charAt(right));
            right++;

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }
}