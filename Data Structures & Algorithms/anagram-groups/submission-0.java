class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] anagram = str.toCharArray();
            Arrays.sort(anagram);
            String stringAnagram = Arrays.toString(anagram);
            
            group.putIfAbsent(stringAnagram, new ArrayList<>());
            group.get(stringAnagram).add(str);
        }

         return new ArrayList<>(group.values());
    
    }
}
