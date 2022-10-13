class UniqueOccurences {
    public static boolean uniqueOccurrences(int[] arr) {
        if (arr.length == 1) return true;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            if (map.containsKey(n)) map.replace(n, map.get(n)+1);
            else map.put(n, 1);
        }

        HashSet<Integer> counts = new HashSet<>(map.values());
        for (int c : map.values()) {
            if (counts.contains(c)) return false;
            else counts.add(c);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("All unique? " + uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }
}