/*
Author: Ashley Kim
Date: 9/17/19
Purpose of code: Creates a node that holds generic data and can point
to other nodes
*/

public class Node<T> {
   private T data;
   private Node<T> front;
   private Node<T> back;

   //Empty contructor - takes in no inputs and makes everything null
    public Node (){
        this.front = null;
        this.back = null;
        this.data = null;
    }

    // One-input constructor - takes in only object data
    public Node (T t){
        this.front = null;
        this.back = null;
        this.data = t;
    }

   //  3-input constructor - takes in front, back, and object data
   public Node (Node f, Node b, T t){
       this.front = f;
       this.back = b;
       this.data = t;
   }

    //Mutator that takes in generic data type and outputs nothing
    public void setData(T t){this.data = t;}

    //Accessor that returns data with no inputs
    public T getData(){return data;}

    //Mutator that takes in front referenced node and outputs nothing
    public void setFront(Node<T> one){this.front = one;}

    //Accessor that returns front referenced node and inputs nothing
    public Node<T> getFront(){return front;}

    //Mutator that takes in back referenced node and outputs nothing
    public void setBack(Node<T> two){this.back = two;}

    //Accessor that returns back referenced node and inputs nothing
    public Node<T> getBack(){return back;}

    //Returns the node's data, no inputs
    public String toString(){
        return "Node: "+ data.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Node){
            return ((Node) obj).getData()==getData();
        }return false;
    }
        //check if obj is a Node __ instanceof _____
        //if so- cast obj to node and then compare
        //it's data (getData) to this.getData
        //else return false

    public static void main(String[] args) {
        Node node1 = new Node ();
        Node node2 = new Node ();
        Node node3 = new Node (node1, node2, 10);
        node2.setData(5);
        node1.setBack(node2);
        node1.setFront(node3);
        System.out.println(node2.getData());
        System.out.println(node1.equals(5));
        System.out.println(node3.toString());

    }}