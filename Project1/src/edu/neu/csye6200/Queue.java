package edu.neu.csye6200;

public class Queue {
    int[] array;
    int front,rear,capacity,count;

    public Queue( int size) {
        this.array = new int[size];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
        this.capacity=size;
    }

    /*
    * To check the size of Queue
    */
    public int size(){
        return count;
    }

    /*
    To check whether Queue if Full or not
     */
    public boolean isFull(){
        return size()==capacity;
    }

    /*
    To check whether Queue if Empty or not
     */
    public boolean isEmpty(){
        return size()==0;
    }

    /*
    To check next element in Queue
     */
    public int peek(){
        if(isEmpty()){
            System.exit(1);
        }
        return array[front];
    }

    /*
    To add element in queue
     */
    public void enqueue(int element){
        if(isFull()){
            System.exit(1);
        }
        rear=(rear+1)%capacity;
        array[rear]=element;
        count++;
        System.out.println("Added " +element+ " to the queue");
    }

    /*
    To remove element from Queue
     */
    public void dequeue(){
        if(isEmpty()){
            System.exit(1);
        }
        int element=peek();
        front=(front+1)%capacity;
        count--;
        System.out.println("Element "+ element+ " removed from the queue");
    }

    public static void demo(){
        Queue q=new Queue(4);
        System.out.println("\n\t.................. Queue class demo() starts....................\n");

        System.out.println("Size of Queue initially: "+ q.size());
        q.enqueue(100);
        q.enqueue(200);
        System.out.println("Size of Queue : "+ q.size());
        q.dequeue();
        System.out.println("Size of Queue after dequeue : "+ q.size());
        System.out.println("Front element in the Queue: " + q.peek());
        q.enqueue(300);
        q.enqueue(400);
        q.enqueue(500);
        if(q.isFull()){

            System.out.println("Queue is Full which is equal to " +q.size());
        }
        else{
            q.enqueue(600);
        }
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        if(q.isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            q.dequeue();
        }

        System.out.println("\n\t.............. Queue class demo() ends......................");

    }
}
