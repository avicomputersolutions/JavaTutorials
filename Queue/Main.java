package Queue;

public class Main {
    public static void main(String[] args) {
        Queue q1= new Queue();   // front = -1, rear =-1

        // // Enqueue - inserting in queue
        // int first=4;
        // q1.front +=1; // front =0
        // q1.rear +=1; // rear = 0 
        // q1.data[q1.rear] = first; // data[0] = first


        // // second element
        // int second =3;
        // q1.rear +=1; // rear =1 
        // q1.data[q1.rear]= second; // data[1] = second
        

        //  // second element
        //  int third =5;
        //  q1.rear +=1; // rear =1 
        //  q1.data[q1.rear]= third; // data[2] = third
        // // Dequeue

        // int value = q1.data[q1.front];
        // q1.front +=1;
        // System.out.println(value);

        // int value2 = q1.data[q1.front];
        // q1.front +=1;
        // System.out.println(value2);

        q1.enqueue(2);
        q1.enqueue(4);
        q1.enqueue(1);
        q1.enqueue(8);
        q1.enqueue(0);
        q1.enqueue(3);
        q1.enqueue(7);
        q1.enqueue(5);
        q1.enqueue(4);
        q1.enqueue(6);
        q1.enqueue(11);
        q1.display();
        System.out.println(q1.dequeue());
        // System.out.println(q1.dequeue());
        // System.out.println(q1.dequeue());
        // System.out.println(q1.dequeue());
        // System.out.println(q1.dequeue());
        // System.out.println(q1.dequeue());
        // System.out.println(q1.dequeue());
        // System.out.println(q1.dequeue());
        // System.out.println(q1.dequeue());
        // System.out.println(q1.dequeue());
        // System.out.println(q1.dequeue());
        // System.out.println(q1.dequeue());
        q1.display();

    }
}
