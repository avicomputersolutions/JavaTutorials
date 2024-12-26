package Array;

public class LeetCodeDay1 {
    // Conductor
    static void printArray(int[] arr){ // Algorithm Initilisation/ Defination.   
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
}
static int[] ConcatenationOfArray(int[] num){
        int[] ans= new int[2*num.length];

        // total length to be filled = 2*num.length / 2 = num.length
        for(int i=0;i<=num.length-1;i++){
            ans[i]=num[i];
            ans[i + num.length]=num[i];
        }

    return ans;
}




    // Driver
    public static void main(String[] args) {
        int[] nums={1,2,1};
        int[] ans= ConcatenationOfArray(nums);
       System.out.println(ans);
    }
}
