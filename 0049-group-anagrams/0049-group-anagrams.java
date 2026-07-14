class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);

            if (!map.containsKey(key)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(word);
                map.put(key, list);
            } else {
                map.get(key).add(word);
            }
        }

        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}