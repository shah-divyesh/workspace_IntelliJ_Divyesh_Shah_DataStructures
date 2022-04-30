package edu.neu.csye6200;

public class Stack {
    int [] array;
    int top;
    int capacity;

    public Stack(int size) {
        array=new int[size];
        capacity=size;
        top=-1;
    }

    /*
    To check the size of stack
     */
    public int size(){
        return top+1;
    }

    /*
    To check whether Stack is empty or not
     */
    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==(capacity-1);
    }

    public void push(int element){
        if(isFull()){
            System.exit(1);
        }
        System.out.println("Adding "+ element +" to the Stack");
        top+=1;
        array[top]=element;
    }

    public int peek(){
        if(isEmpty()){
            System.exit(1);
            return -1;
        }
        return array[top];

    }


    public int pop(){
        if(isEmpty()){
            System.exit(1);
            return -1;
        }
        System.out.println("Removing "+ peek()+" from the Stack");
        return array[top--];
    }

    public static void demo(){
        System.out.println("\n\t.................. Stack class demo() starts....................\n");
        Stack s=new Stack(4);
        System.out.println("Size of Queue initially: "+ s.size());
        s.push(100);
        s.push(200);
        System.out.println("Size of Queue after 2 push() operations: "+ s.size());
        s.pop();
        System.out.println("Size of Stack after 1 pop() operation: "+ s.size());
        System.out.println("Top element in the Stack: " + s.peek());
        s.push(300);
        s.push(400);
        s.push(500);
        if(s.isFull()){

            System.out.println("Stack is Full which is equal to " +s.size());
        }
        else{
            s.push(600);
        }
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        if(s.isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            s.pop();
        }

        System.out.println("\n\t.............. Stack class demo() ends......................");
    }
}
