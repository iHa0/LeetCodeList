package Top100;

public class Top208 {
    private boolean isEnd;
    private Top208[] children;
    public Top208() {
        isEnd = false;
        children = new Top208[26];
    }

    public void insert(String word) {
        Top208 node = this;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);
            if (node.children[ch - 'a'] == null)
                node.children[ch - 'a'] = new Top208();
            node = node.children[ch - 'a'];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Top208 node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    public Top208 searchPrefix(String prefix){
        Top208 node = this;
        int len = prefix.length();
        for (int i = 0; i < len; i++) {
            char ch = prefix.charAt(i);
            if (node.children[ch - 'a'] == null)
                return null;
            node = node.children[ch - 'a'];
        }
        return node;
    }
}
