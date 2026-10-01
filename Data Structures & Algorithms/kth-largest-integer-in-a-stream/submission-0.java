class KthLargest {
    PriorityQueue<Integer> heap;
    int kth;
    public KthLargest(int k, int[] nums) {
        kth = k;
        heap = new PriorityQueue<>();
        for(int i: nums) add(i);
    }
    
    public int add(int val) {
        heap.add(val);
        if(heap.size() > kth) heap.poll();

        return heap.peek();
    }
}
