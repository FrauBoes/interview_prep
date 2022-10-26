class FindJudge {
    public static int findJudge(int n, int[][] trust) {
        int[] people = new int[n+1];  // adjust to 1-based indexing

        for (int[] pair : trust) {
            people[pair[0]]--;
            people[pair[1]]++;
        }

        for (int i = 1; i < people.length; i++) {
            if (people[i] == n-1) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Judge is: " + findJudge(2, new int[][]{{1,2}}));
    }
}