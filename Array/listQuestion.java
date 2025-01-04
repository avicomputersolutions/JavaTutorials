package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class listQuestion{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        List<int[]> li = new ArrayList<int[]>(); 
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        int count=0;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==s){
                li.add(new int[]{arr[l],arr[r]});
                l++;
                r--;
            }else if(sum > s){
                r--;
            }else{
                l++;
            }
        }
        return li;
    }
    public static void main(String[] args) {
        int[] arr={1, 2 ,3 ,4 ,5};
        List<int[]> ans=pairSum(arr, 5);
        for (int[] pair : ans) {
            System.out.println(Arrays.toString(pair));
        }
    }
}