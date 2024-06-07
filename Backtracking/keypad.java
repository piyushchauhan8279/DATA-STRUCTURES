public class keypad {


public static char[][] L={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'}
,{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};


final  static void rec(String str){
    int len=str.length();
    if(len==0){
        System.out.println("");
        return;
    }
    bfs(0,len,new StringBuilder(),str);


}

public static void bfs(int pos,int len,StringBuilder sb ,String str){
    if(len==pos){
        System.out.println(sb.toString());

    }
    else{
        char[] letters=L[Character.getNumericValue(str.charAt(pos))];
        for(int i=0;i<letters.length;i++){
            bfs(pos+1, len,new StringBuilder(sb).append(letters[i]), str);
        }
    }
}
public static void main(String[] args) {
    rec("23");
    
}
    
}
