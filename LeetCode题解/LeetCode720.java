public class LeetCode720 {
    class Trie {
        class TrieNode {
            boolean isEnd;
            TrieNode[] next;

            public TrieNode() {
                isEnd = false;
                next = new TrieNode[26];
            }
        }

        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }
        public void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.next[c - 'a'] == null) {
                    node.next[c - 'a'] = new TrieNode();
                }
                node = node.next[c - 'a'];
            }
            node.isEnd = true;
        }

        public boolean search(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.next[c - 'a'] == null)
                    return false;
                if (!node.next[c - 'a'].isEnd)
                    return false;
                node = node.next[c - 'a'];
            }
            return node != null && node.isEnd;
        }
    }

    public String longestWord(String[] words) {
        int len = words.length;
        Trie trie = new Trie();
        for (String s : words) {
            trie.insert(s);
        }
        String longest = "";
        for (String s : words) {
            if (trie.search(s)) {
                if (s.length() > longest.length() || (s.length() == longest.length() &&
                        s.compareTo(longest) < 0))
                    longest = s;
            }
        }
        return longest;
    }
}
