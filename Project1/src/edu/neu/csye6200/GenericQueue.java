package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class GenericQueue<T> {
    private List<T> queueList;
    static int front,rear,capacity,count;

    public GenericQueue(int size) {
        queueList=new ArrayList<T>(size);
        front=0;
        rear=-1;
        capacity=size;
        count=0;
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
    public T peek(){
        if(isEmpty()){
            System.exit(1);
        }
        return queueList.get(front);
    }


    /*
   To add element in queue
    */
    public void enqueue(T element){
        if(isFull()){
            System.exit(1);
        }
        rear=(rear+1)%capacity;
        queueList.add(rear,element);
        count++;
        System.out.println("Added " +element+ " to the Genericqueue");
    }

    /*
    To remove element from Queue
     */
    public void dequeue(){
        if(isEmpty()){
            System.exit(1);
        }
        T element=peek();
        front=(front+1)%capacity;
        count--;
        System.out.println("Element "+ element+ " removed from the GenericQueue");
    }

    public static void demo(){
        GenericQueue q=new GenericQueue(4);
        System.out.println("\n\t.................. GenericQueue class demo() starts........................\n");

        System.out.println("Size of GenericQueue initially: "+ q.size());
        q.enqueue('@');
        q.enqueue('$');
        System.out.println("Size of GenericQueue : "+ q.size());
        q.dequeue();
        System.out.println("Size of GenericQueue after dequeue: "+ q.size());
        System.out.println("Front element in the GenericQueue: " + q.peek());
        q.enqueue('%');
        q.enqueue('D');
        q.enqueue(500);
        if(q.isFull()){
            System.out.println("GenericQueue is Full which is equal to :"+q.size());
        }
        else{
            q.enqueue('&');
        }
        for(int i=0;i<q.queueList.size();i++){
            System.out.println(q.queueList.get(i));
        }
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        if(q.isEmpty()){
            System.out.println("GenericQueue is Empty");
        }
        else{
            q.dequeue();
        }

        System.out.println("\n\t..................... GenericQueue class demo() ends........................");

    }


}
