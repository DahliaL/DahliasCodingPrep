class TrieNode {
    HashMap<Character, TrieNode> children;
    boolean endOfWord = false; 

    public TrieNode() {
        this.children = new HashMap<Character, TrieNode>();
    }

    public TrieNode(boolean end) {
        this.children = new HashMap<Character, TrieNode>();
        this.endOfWord = end;
    }

    public TrieNode addChild(Character c, boolean end) {
        if(!children.containsKey(c))
            children.put(c, new TrieNode(end));
        else {
            TrieNode child = children.get(c);
            child.endOfWord = child.endOfWord || end; // Update endOfWord flag if necessary
        }

        return children.get(c);
    }

    public TrieNode findChild(Character c) {
        if(children.containsKey(c))
            return children.get(c);
        
        return null;
    }

    public boolean isEnd() {
        return endOfWord;
    }
}

class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        this.root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode temp = root;

        for(int i = 0; i < word.length(); i++) {
            temp = temp.addChild(word.charAt(i), i == word.length()-1);
        }
    }

    public boolean findWord(TrieNode curr, int index, String word) {
        if(index == word.length())
            return curr.isEnd();
        
        Character c = word.charAt(index);

        if(c == '.') {
            for (TrieNode child : curr.children.values()) {
                if (findWord(child, index + 1, word)) {
                    return true;
                }
            }
            return false;
        } else {
            TrieNode temp = curr.findChild(c);

            if(temp == null)
                return false;
            else 
                return findWord(temp, index+1, word);
        }

       // return false;
    }
    
    public boolean search(String word) {
        return findWord(root, 0, word);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
