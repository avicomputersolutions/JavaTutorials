package JavaDSA;

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
}
