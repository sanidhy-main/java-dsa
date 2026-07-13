class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)) {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(key, list);
            } else {
                map.get(key).add(word);
            }
        }

        return new ArrayList<>(map.values());
    }
}