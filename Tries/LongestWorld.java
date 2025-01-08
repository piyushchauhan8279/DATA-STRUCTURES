public class LongestWorld {

    static class Node{
        boolean eow=false;
        Node children[]=new Node[26];

        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
        }
    }

    // insert function 

   public static  Node root=new Node();
    public static void insert(String key){
        Node curr=root;

        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }

        curr.eow=true;


    }

    // longest word in a array which contains all its prefixs 

    public static String ans="";
    public static void longestWorld(Node root,StringBuilder temp){
        if(root==null) return;
        for(int i=0;i<root.children.length;i++){
            if(root.children[i]!=null && root.children[i].eow==true){
                char ch=(char)(i+'a');
                temp.append(ch);
                if(temp.length()>ans.length()){
                    ans=temp.toString();
                }

                longestWorld(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);  // backtrack 

            }
        }


    }
    
    public static void main(String[] args) {
        String world[]={"w","wo","wor","worl","world","world"};

        for(int i=0;i<world.length;i++){
            insert(world[i]);
        }

        longestWorld(root,new StringBuilder(""));
        System.out.println(ans);

    }
    
}
