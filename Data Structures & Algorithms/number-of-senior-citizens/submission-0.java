class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for (String detail : details) {
            char[] letters = detail.toCharArray();
            String age = String.valueOf(letters[11]) + letters[12];

            if(Integer.parseInt(age) > 60){
                count++;
            }
        }

        return count;
    }
}