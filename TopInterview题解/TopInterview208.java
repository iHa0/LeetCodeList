package TopInterview;

public class Trie {
    private boolean isEnd;
    private Trie[] children;

    public Trie(){
        this.isEnd = false;
        children = new Trie[26];
    }

    public void insert(String word) {
        Trie node = this;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);
            if (node.children[ch - 'a'] == null)
                node.children[ch - 'a'] = new Trie();
            node = node.children[ch - 'a'];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public Trie searchPrefix(String prefix){
        Trie node = this;
        int len = prefix.length();
        for (int i = 0; i < len; i++) {
            char ch = prefix.charAt(i);
            if (node.children[ch - 'a'] == null)
                return null;
            node = node.children[ch - 'a'];
        }
        return node;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }
}
