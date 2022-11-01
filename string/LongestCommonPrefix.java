class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) return strs[0];

        // get shortest string as longest common prefix
        String lcp = strs[0];
        for (String s : strs) {
            if (s.length() < lcp.length()) lcp = s;
        }

        for (int i = 1; i <= lcp.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                String s = strs[j];
                if (!s.startsWith(lcp.substring(0, i))) return lcp.substring(0, i-1);
            }
        }

        return lcp;

    }

    public static void main(String[] args) {
        System.out.println("LCP: " + longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }
}