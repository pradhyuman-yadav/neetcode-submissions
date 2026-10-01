class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(Arrays.asList(Arrays.stream(stones).boxed().toArray(Integer[]::new)));

        while(pq.size()>1) {
            int x = pq.poll();
            int y = pq.poll();
            if(x!=y) pq.offer(Math.abs(x-y));
        }
        if(pq.size() == 0) return 0;

        return pq.poll();
    }
}
