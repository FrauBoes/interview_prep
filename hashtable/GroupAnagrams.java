import java.util.*;

class GroupAnagrams {
    static final HashMap<String, List<String>> MAP = new HashMap<>();
    public static List<List<String>> groupAnagrams(String[] strs) {

        for (String s : strs) {
            var chars = s.toCharArray();
            Arrays.sort(chars);
            var key = Arrays.toString(chars);
            if (MAP.containsKey(key)) MAP.get(key).add(s);
            else {
                MAP.put(key, new ArrayList(List.of(s)));
            }

        }

        return new ArrayList(MAP.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}