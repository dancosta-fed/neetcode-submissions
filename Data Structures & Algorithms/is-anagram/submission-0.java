class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        char[] arrayT = t.toCharArray();
        char[] arrayS = s.toCharArray();

        Arrays.sort(arrayT);
        Arrays.sort(arrayS);

        for(int i = 0; i < t.length(); i++){
            if (arrayT[i] != arrayS[i]) {
                return false;
            }
        }
        return true;
    }
}
