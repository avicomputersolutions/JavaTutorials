

public class Array {

    void printArray(int[] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
    void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    int sumOfElement(int[] arr){
        int sum=0;
        for(int val:arr){
            sum += val;
        }
        return sum;
    }

    int factorial(int n){
        int fact=1;
        for(int i=n;i>0;i--){
            fact *= i;
        }
        return fact;
    }

    void FactorialOfEachInArray(int[] arr){
        for(int val : arr){
            int fact = factorial(val);
            System.out.println(val +" - "+fact);
        }
    }

    boolean CheckSum(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                if(sum == target){
                    return true;
                }
            }
        }
        return false;
    }

    int[] PairSum(int[] arr, int target){
        int[] sumPair = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                if(sum == target){
                    sumPair[0]=i;
                    sumPair[1]=j;
                    return sumPair;
                }
            }
        }
        return sumPair;
    }

    int countPair(int[] arr, int target){
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                if(sum == target){
                    c +=1;
                }
            }
        }
        return c;
    }

}
