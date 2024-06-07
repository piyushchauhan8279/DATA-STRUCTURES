public class TowerOfHanoi {
    public static void  towerOfHanoi(int n,String Src,String Helper,String Dest){
        if(n==1){
            System.out.println("move "+n+" disks from "+Src+" to "+Dest);
            return;
        }
        towerOfHanoi(n-1,Src,Dest,Helper);

        System.out.println("move "+n+" disks from "+Src+" to "+Dest);
        
        towerOfHanoi(n-1,Helper,Src,Dest);
        


    }
    public static void main(String[] args) {
        int n=4;
        towerOfHanoi(n,"Src","Helper","Dest");
    }
    
}
