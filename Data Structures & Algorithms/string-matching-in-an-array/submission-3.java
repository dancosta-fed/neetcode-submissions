class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> substr = new ArrayList<>();

        for(String word : words) {
            for (int i = 0; i < words.length; i++) {
                if (Objects.equals(words[i], word)) {
                    continue;
                }

                if (word.contains(words[i]) && !substr.contains(words[i])) {
                    substr.add(words[i]);
                }
            }
        }

        return substr;
    }
}