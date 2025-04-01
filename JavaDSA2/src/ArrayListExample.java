import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public static List<Integer> twoSum(int arr[], int target) {
        List<Integer> l= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                if(sum == target){
                   l.add(i);
                   l.add(j);
                }
            }
        }
        return l;
        // Your code here
    }
    public static void main(String[] args) {
//      ArrayList<Integer>  arr= new ArrayList<>();
//      // CRUD, Insert
//        arr.add(1);
//        arr.add(2);
//        arr.add(4);
//        arr.add(2);
//
//        // print the element on index
//        System.out.println(arr.get(0));
//
//        // Searching
//        System.out.println(arr.indexOf(2));
//        // update value on index
//        arr.set(arr.indexOf(2),8);
//        System.out.println(arr.get(arr.indexOf(8)));
//        System.out.println(arr.set(arr.indexOf(4),16));
////        System.out.println(arr.get(arr.indexOf(arr.set(arr.indexOf(4),16))));
//        System.out.println(arr.isEmpty());
//        arr.remove(arr.indexOf(8));
        int arr[]={2, 9, 10, 4, 15};
        int target=13;
        List<Integer> pair = twoSum(arr,target);
        System.out.println(pair);
        for(int i=0;i<pair.size();i++){
            System.out.println(pair.get(i));
        }
    }
}
