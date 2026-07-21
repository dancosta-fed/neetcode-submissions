class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int n : nums) {
            frequency.put(n, frequency.getOrDefault(n, 0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> entries = frequency.entrySet();
        List<Map.Entry<Integer, Integer>> lista = new ArrayList<>(entries);
        lista.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = lista.get(i).getKey();
        }


        return result;
        
    }
}
