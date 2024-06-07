public class assignmentQues2{
    public static int rotated(int nums[],int target){
        //find index with the help of binary search
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=(start+end)/2;

            if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid] >target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return-1;

    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6};
        int target=3;
       int n= rotated(nums,target);
       System.out.println(n);
       for(int i=n;i<nums.length;i++){
        System.out.print(nums[i]+" ");
       
       }
        

    }
}