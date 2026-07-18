class Solution {
    public boolean isPalindrome(String s) {

        String lowerCase = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int j = lowerCase.length();

        for(int i = 0; i < lowerCase.length(); i++){

                if(lowerCase.charAt(i) != lowerCase.charAt(j - 1)){
                    return false;
                }
            j--;
        }

        return true;        

        
    }
}
