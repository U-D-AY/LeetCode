import java.util.PriorityQueue;

class KthLargest {

    private final PriorityQueue<Integer> minHeap;
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap =new PriorityQueue<>(k);

        for(int i: nums){
            minHeap.offer(i);
            if(minHeap.size() > k)
                minHeap.poll();
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
            if(minHeap.size() > k)
                minHeap.poll();
        
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */