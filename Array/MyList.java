package Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MyList {
    public static void main(String[] args) {
        // Creation of List
        List l1= new ArrayList<>();
        l1.add(23);
        l1.add(29);
        l1.add(22);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
        System.out.println(l1.get(0));
        System.out.println(l1.indexOf(22));
        System.out.println(l1.size());
        l1.set(l1.indexOf(22), 28);
        System.out.println(l1);
        List l2= Collections.emptyList();
        System.out.println(l2);

    }
}
