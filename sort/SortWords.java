import java.util.*;

class SortWords {

    class Word implements Comparable<Word> {
        private String word;
        private int count;

        public Word(String word, int count) {
            this.word = word;
            this.count = count;
        }

        public int compareTo(Word other) {
            if (this.count == other.count) return this.word.compareTo(other.word);
            return other.count - this.count;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        var map = new HashMap<String, Integer>();
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        var candidates = new ArrayList<Word>();
        for (var entry : map.entrySet()) {
            candidates.add(new Word(entry.getKey(), entry.getValue()));
        }

        var maxHeap = new PriorityQueue<Word>(candidates);
        var result = new ArrayList<String>();
        for (int i = 0; i < k; i++) {
            result.add(maxHeap.poll().word);
        }

        return result;
    }

    public static void main(String[] args) {
        new SortWords().topKFrequent(new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"}, 4)
                .forEach(System.out::println);
    }
}