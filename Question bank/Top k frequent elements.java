class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        Queue<Integer> heap = new PriorityQueue<>(
            (n1,n2) -> map.get(n2) - map.get(n1));
        
        for(int n : map.keySet()){
            heap.add(n);
        }
        
        int[] res = new int[k];
        for(int i=k-1;i>=0;i--){
            res[i] = heap.poll();
        }
        return res;
    }
}
