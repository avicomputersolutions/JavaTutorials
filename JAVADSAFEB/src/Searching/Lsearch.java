package Searching;

public class Lsearch {
    int LinearSearch(int[] arr, int Searchval){
        for(int i=0;i<arr.length;i++){
            if(Searchval == arr[i]){
                return i+1;
            }
        }
        return -1;
    }

    int binarySearch(int[] arr,int searchVal){
        // only works for sorted array
        int s = 0;
        int e= arr.length-1;
        while(s<=e){
          int mid = (s+e)/2;
          if(arr[mid]==searchVal){
              return mid+1;
          }
          else if(searchVal < arr[mid]){
              e=mid-1;
          }else{
              s=mid+1;
          }
        }
        return -1;
    }
}
