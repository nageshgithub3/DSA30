class KthLargest {
    private PriorityQueue<Integer> mHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        mHeap = new PriorityQueue<>(); 
        for (int num : nums) {
            add(num);
        }
        
    }
    
    public int add(int val) {
         mHeap.add(val);
        if (mHeap.size() > k) {
            mHeap.poll(); 
        }
        return mHeap.peek(); 
    }
      
    
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */