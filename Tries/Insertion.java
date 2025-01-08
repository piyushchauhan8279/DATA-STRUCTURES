class Insertion{
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

    // insert function:- T.C=O(L) , where L is length of longest word

    public static void insert(String word){ // there  their 
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';

            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    // search function :- T.C = O(L)

    public static boolean search(String key){
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';

            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow==true;


    }

    public static void main(String[] args) {
        String word[]={"there","their","a","any","thee"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);

        }

        System.out.println(search("any"));
        System.out.println(search("a"));
        System.out.println(search("thee"));
        System.out.println(search("the"));
        System.out.println(search("thor"));
        

    }

}