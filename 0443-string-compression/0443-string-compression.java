class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while (read < chars.length && write < chars.length) {
            int count = 1;

            while (read + 1 < chars.length && chars[read] == chars[read+1]) {
                count++;
                read++;
            }

            chars[write++] = chars[read];
            read++;

            if (count > 1) {
                String num = Integer.toString(count);
                int i = 0;
                while (i < num.length() && write < chars.length) {
                    chars[write++] = num.charAt(i);
                    i++;
                }
            }
        }

        return write;
    }
}