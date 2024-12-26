package Array;

public class Searching {
    

    // conductor code
   static void LinearSearch(int[] arr,int target){
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==target){
                System.out.println(i);
                break;
            }
        }
    }


  static  void binarySearch(int[] arr, int value){
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==value){
                System.out.println(mid);
                break;
            }
            else if( arr[mid] > value){
                e= mid-1;
            }else{
                s=mid+1;
            }
        }
    }
    static void twoPointer(int[] arr, int target) 
        {
            // Two sum problem on sorted Array // Problem no1 167 Leetcode
            int l=0;
            int r=arr.length-1;
            while(l<=r){
                int sum=arr[l]+arr[r];
                if(sum== target){
                    System.out.println("two indices are : "+l +" and "+ r);
                    break;
                }
                else if (sum > target){
                    r--;
                }else{
                    l++;
                }
            }
        }

 
    public static void main(String[] args) {  // Driver code
        int[] arr={2,7,11,15};
        int value=9;
        twoPointer(arr,value);
    }
}
