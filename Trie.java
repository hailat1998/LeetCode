class TrieNode{
  Map< Character , TrieNode> map = new HashMap< Character , TrieNode>();
  boolean isEnd = false;
}
class Trie {
  TrieNode trie;
    public Trie() {
        this.trie= new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr = this.trie;
        for(int i=0; i<word.length(); i++){
            if(!(curr.map.containsKey(word.charAt(i))))
               curr.map.put(word.charAt(i), new TrieNode());
       curr = curr.map.get(word.charAt(i));
        }
        curr.isEnd=true;
    }
    
    public boolean search(String word) {
        TrieNode curr= this.trie;
        for(int i=0; i<word.length(); i++){
            
            if(!(curr.map.containsKey(word.charAt(i))))
                return false; 
            else
                 curr=curr.map.get(word.charAt(i));
                  }
             return curr.isEnd;
    }
    
    public boolean startsWith(String word) {
         TrieNode curr= this.trie;
        for(int i=0; i< word.length(); i++){
             if(!(curr.map.containsKey(word.charAt(i))))
               return false;
            else
             curr=curr.map.get(word.charAt(i)); 
             }
             return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
