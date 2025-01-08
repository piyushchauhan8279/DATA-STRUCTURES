public class CheckPrefix {

    static class Node{
        Node children[]=new Node[26];
        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
        }
    }

        public static Node root=new Node();
        public static void insert(String key){
        Node curr=root;

        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
    }


    public static boolean startsWith(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;

    }
    

    public static void main(String[] args) {
        String words[]={"apple","app","mango","man","women"};
        String prefix1="app";
        String prefix2="moon";


        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));



    }
    
}
