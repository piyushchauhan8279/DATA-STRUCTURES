public class removeDuplicates {
    public static void rmvDuplicate(int idx,String str,boolean map[] , StringBuilder newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        //work:-

        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            rmvDuplicate(idx+1, str, map, newstr);
        }
        else{
            map[currchar-'a']=true;
            rmvDuplicate(idx+1, str, map, newstr.append(currchar));
        }

    }
    public static void main(String[] args) {
        String str="appnnacollege";
        boolean map[]=new boolean[26];
        StringBuilder newstr=new StringBuilder("");
        rmvDuplicate(0, str, map,newstr);
    }
    
}
