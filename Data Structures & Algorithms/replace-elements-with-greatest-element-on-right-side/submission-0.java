class Solution {
    public int[] replaceElements(int[] arr) {
        int[] replaced = new int[arr.length];

        for (int i = 0; i < arr.length; i++){

            if (i == arr.length - 1){
                replaced[i] = -1;
                continue;
            }
            int temp = arr[i + 1];
            for (int j = i + 1; j < arr.length; j++){

                if(temp < arr[j]){
                    temp = arr[j];
                }
            }

            replaced[i] = temp;
        }

        return replaced;
    }
}