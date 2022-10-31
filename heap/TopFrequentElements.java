class TopFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        var map = new Map<Integer, Integer>();

        for (int n : nums) {
            map.merge(n, 1, Integer::sum);
        }

        var minHeap = new PriorityQueue<Number>((n1, n2) -> Integer.compare(n1.frequency(), n2.frequency()));

        map.forEach((number, frequency) -> {
            minHeap.add(new Number(number, frequency));
            if (minHeap.size() > k) minHeap.poll();  // restrict heap size to k
        });

        var result = new int[k];
        int i = 0;
        while (i < k) {
            result[i++] = minHeap.poll().number();
        }

        return result;
    }

    record Number(Integer number, Integer frequency) { }
}