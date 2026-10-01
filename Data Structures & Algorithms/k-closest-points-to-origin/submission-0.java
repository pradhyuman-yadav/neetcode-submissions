class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Comparator<int[]> distanceFormula = new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                double distanceP1 = Math.sqrt(p1[0]*p1[0] + p1[1]*p1[1]);
                double distanceP2 = Math.sqrt(p2[0]*p2[0] + p2[1]*p2[1]);
                return Double.compare(distanceP1, distanceP2);
            }
        };

        PriorityQueue<int[]> pq = new PriorityQueue<>(distanceFormula);

        for(int[] point: points){
            pq.offer(point);
        }

        int[][] result = new int[k][2];

        for(int i=0; i<k; i++) {
            result[i] = pq.poll();
        }

        return result;

    }
}
