class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while (read < chars.length) {
            int count = 1; //reset number of characters to 1
            while (read + 1 < chars.length && chars[read] == chars[read+1]) { //read ends at last char in a sequence
                read++; //read forward
                count++; //add to count
            }

            if (write < chars.length) {
                chars[write++] = chars[read]; //writes the character in its position, and moves forward
                if (count > 1) {
                    String s = Integer.toString(count); //converts count to string

                    for (char c : s.toCharArray()) {
                        chars[write++] = c; //writes the count of the character, and moves forward
                    }
                }
            }

            read++; //moves read to the first character of the next sequence
        }

    return write; //returns array till the last character written
    }
}

//this took me so long, oh god