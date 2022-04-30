package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class GenericStack<T> {
    private List<T> stackList;
    int capacity,top;

    public GenericStack(int size) {
        stackList =new ArrayList<T>(size);
        capacity=size;
        top=-1;
    }

    public int size(){
        return top+1;
    }

    /*
    To check whether GenericStack is empty or not
     */
    public boolean isEmpty(){
        return top==-1;
    }

    /*
    To check whether GenericStack is Full or not
     */
    public boolean isFull(){
        return top==(capacity-1);
    }

    /*
    To add element to GenericStack
     */
    public void push(T element){
        if(isFull()){
            System.exit(1);
        }
        System.out.println("Adding "+ element +" to the GenericStack");
        top+=1;
        stackList.add(element);
    }

    /*
    To see the topmost element of GenericStack
     */
    public T peek(){
        if(isEmpty()){
            System.exit(1);
            return null;
        }
        return stackList.get(top);

    }

    /*
    To remove the topmost element from the Stack
     */
    public T pop(){
        if(isEmpty()){
            System.exit(1);
            return null;
        }
        System.out.println("Removing "+ peek()+" from the GenericStack");
        return stackList.get(top--);
    }

    public static void demo(){
        GenericStack genericStack=new GenericStack(4);
        System.out.println("\n\t.................. GenericStack class demo() starts........................\n");

        System.out.println("Size of GenericStack initially: "+ genericStack.size());
        genericStack.push('@');
        genericStack.push('$');
        System.out.println("Size of GenericStack after 2 push() operations : "+ genericStack.size());
        genericStack.pop();
        System.out.println("Size of GenericStack after pop() operation: "+ genericStack.size());
        System.out.println("Topmost element in the GenericStack: " + genericStack.peek());
        genericStack.push('%');
        genericStack.push('D');
        genericStack.push('F');
        if(genericStack.isFull()){
            System.out.println("GenericStack is Full which is equal to :"+genericStack.size());
        }
        else{
            genericStack.push('&');
        }
        genericStack.pop();
        genericStack.pop();
        genericStack.pop();
        genericStack.pop();
        if(genericStack.isEmpty()){
            System.out.println("GenericStack is Empty");
        }
        else{
            genericStack.pop();
        }

        System.out.println("\n\t..................... GenericStack class demo() ends........................");

    }
}
