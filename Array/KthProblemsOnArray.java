package Array;

import java.util.Arrays;

public class KthProblemsOnArray {

    // conductor 
    static int largestNoInArray(int[] arr){
            int max=arr[0]; // if array has only one element

            // but if arrya has more element
            for(int i=1;i<= arr.length-1;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
    }
    static int smallestNoInArray(int[] arr){
        int min=arr[0]; // if array has only one element

        // but if arrya has more element
        for(int i=1;i<= arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
}

static int secondlargestNoInArray(int[] arr){
    int max=arr[0]; // if array has only one element
    int smax=arr[0];

    // but if arrya has more element
    for(int i=1;i<= arr.length-1;i++){
        if(arr[i]>max){
            
            smax=max;
            max=arr[i];
        }
    }
    return smax;
}

static int kthLargest(int[] arr, int k){
   int n=arr.length;
    Arrays.sort(arr);

    return arr[n-k];
}

static int kthSmallest(int[] arr, int k){
    int n=arr.length;
     Arrays.sort(arr);
 
     return arr[k-1];
 }
 

    // Driver code
    public static void main(String[] args) {
        int[] arr={2,3,1,0,4,8,5,2,8,10,9,0,2};
        int k=4;
        int largeest =largestNoInArray(arr);
        int slargest= secondlargestNoInArray(arr);
        int smallest= smallestNoInArray(arr);
        int kthLargest=kthLargest(arr, k);
        //System.out.println("smallest no in array is : "+smallest);
        
        System.out.println("Largest : "+largeest);
        System.out.println(k+"th largest: "+kthLargest);
    }
    
}
