class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (String str : strs) {

            int limit = Math.min(prefix.length(), str.length());

            int j = 0;
            while (j < limit && prefix.charAt(j) == str.charAt(j)) {
                j++;
            }

            prefix = prefix.substring(0, j);

            if (prefix.isEmpty()) {
                return "";
            }
        }

        return prefix;
    }
}