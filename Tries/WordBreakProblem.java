public class WordBreakProblem {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        public Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    public static boolean search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            if(curr.children[key.charAt(i)-'a']==null) return false;
            curr=curr.children[key.charAt(i)-'a'];

        }
        return curr.eow;

    }

    public static boolean wordBreak(String key) {
        if (key.length() == 0) return true;

        for (int i = 1; i <= key.length(); i++) {
            // Check prefix key.substring(0, i)
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String  words[]={"i","like","sam","samsung","mobile","ice"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        String key="ilikesamsung";

        System.out.println(wordBreak(key));   // true
        System.out.println(wordBreak("ilike"));  // true 
        System.out.println(wordBreak("ilikesung"));   // false
        System.out.println(wordBreak("lik"));  // false
        System.out.println(wordBreak("icee"));  // false
    }
    
}
