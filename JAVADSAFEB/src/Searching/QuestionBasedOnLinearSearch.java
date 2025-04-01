package Searching;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionBasedOnLinearSearch {
    int maxofArray(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int val : arr){
            if(val > max){
                max= val;
            }
        }
        return max;
    }
    int minofArray(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int val : arr){
            if(val < min){
                min= val;
            }
        }
        return min;
    }
    int SecondmaxofArray(int[] arr){
        int max=arr[0];
        int smax= arr[0];
        for(int val : arr){
            if(val > max){
                smax=max;
                max= val;
            }
        }
        return smax;
    }

    int KthMaximum(int[] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length-k];
    }
    int KthMinimum(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    int[] reverseArray(int[] arr){
        int s= 0;
        int e= arr.length-1;
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
    int kthFactor(int n, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        int fact=1;
        while(fact<=n){
            if(n% fact==0){
                res.add(fact);
            }
            fact++;
        }
        return res.get(k-1);
    }

}
