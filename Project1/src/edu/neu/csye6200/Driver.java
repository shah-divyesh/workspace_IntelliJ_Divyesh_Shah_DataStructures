package edu.neu.csye6200;

public class Driver {

    public static void main(String[] args) {
        Queue.demo();
        GenericQueue.demo();
        Stack.demo();
        GenericStack.demo();
    }
}


//Output of the Program

//C:\Users\DIVYESH\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=54979:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath F:\CSYE6200\workspace_IntelliJ_Divyesh_Shah_DataStructures\Project1\out\production\Project1 edu.neu.csye6200.Driver
//
//        .................. Queue class demo() starts....................
//
//        Size of Queue initially: 0
//        Added 100 to the queue
//        Added 200 to the queue
//        Size of Queue : 2
//        Element 100 removed from the queue
//        Size of Queue after dequeue : 1
//        Front element in the Queue: 200
//        Added 300 to the queue
//        Added 400 to the queue
//        Added 500 to the queue
//        Queue is Full which is equal to 4
//        Element 200 removed from the queue
//        Element 300 removed from the queue
//        Element 400 removed from the queue
//        Element 500 removed from the queue
//        Queue is Empty
//
//        .............. Queue class demo() ends......................
//
//        .................. GenericQueue class demo() starts........................
//
//        Size of GenericQueue initially: 0
//        Added @ to the Genericqueue
//        Added $ to the Genericqueue
//        Size of GenericQueue : 2
//        Element @ removed from the GenericQueue
//        Size of GenericQueue after dequeue: 1
//        Front element in the GenericQueue: $
//        Added % to the Genericqueue
//        Added D to the Genericqueue
//        Added 500 to the Genericqueue
//        GenericQueue is Full which is equal to :4
//        Element $ removed from the GenericQueue
//        Element % removed from the GenericQueue
//        Element D removed from the GenericQueue
//        Element @ removed from the GenericQueue
//        GenericQueue is Empty
//
//        ..................... GenericQueue class demo() ends........................
//
//        .................. Stack class demo() starts....................
//
//        Size of Queue initially: 0
//        Adding 100 to the Stack
//        Adding 200 to the Stack
//        Size of Queue after 2 push() operations: 2
//        Removing 200 from the Stack
//        Size of Stack after 1 pop() operation: 1
//        Top element in the Stack: 100
//        Adding 300 to the Stack
//        Adding 400 to the Stack
//        Adding 500 to the Stack
//        Stack is Full which is equal to 4
//        Removing 500 from the Stack
//        Removing 400 from the Stack
//        Removing 300 from the Stack
//        Removing 100 from the Stack
//        Stack is Empty
//
//        .............. Stack class demo() ends......................
//
//        .................. GenericStack class demo() starts........................
//
//        Size of GenericStack initially: 0
//        Adding @ to the GenericStack
//        Adding $ to the GenericStack
//        Size of GenericStack after 2 push() operations : 2
//        Removing $ from the GenericStack
//        Size of GenericStack after pop() operation: 1
//        Topmost element in the GenericStack: @
//        Adding % to the GenericStack
//        Adding D to the GenericStack
//        Adding 500 to the GenericStack
//        GenericStack is Full which is equal to :4
//        Removing D from the GenericStack
//        Removing % from the GenericStack
//        Removing $ from the GenericStack
//        Removing @ from the GenericStack
//        GenericStack is Empty
//
//        ..................... GenericStack class demo() ends........................
//
//        Process finished with exit code 0