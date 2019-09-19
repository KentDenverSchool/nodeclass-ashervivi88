/*
Author: Ashley Kim
Date: 9/17/19
//FIXME: 9/17???
Purpose of code: Creates a node that holds generic data and can point
to other nodes
*/
//FIXME: Purpose of code could be less vague and more descriptive

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
    //FIXME: Takes in T data, not necessarily object
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

   //FIXME: Good style is including a line break after the opening parenthesis
   
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
        if (data == null){
            return "null";
        //FIXME: Not good style
        }else{
        return "Node: "+ data.toString();
    }}

   //FIXME: Equals should take in a type T, not an object
   //FIXME: Overcomplicated code
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

   //FIXME: Good style to have a separate file for driver
    public static void main(String[] args) {
       //FIXME: Why include spaces between Node and () but not between setData and (3)
        Node node1 = new Node ();
        System.out.println("Printing Node 1: " + node1);

        Node node2 = new Node (1);
        System.out.println("Printing Node 2: " + node2);

        Node node3 = new Node (node1, node2, 2);
        System.out.println("Printing Node 3: " + node3);

        node1.setData(3);
        System.out.println("Testing getData: " + node1.getData());

        node1.setBack(node2);
        System.out.println("Testing getBack: " + node1.getBack());

        node1.setFront(node3);
        System.out.println("Testing getFront: " + node1.getFront());

        System.out.println("Testing .equals, should return false: " + node2.equals(node3));
        node3.setData(1);
        System.out.println("Testing .equals, should return true: " + node2.equals(node3));
        
        System.out.println("Testing toString: " + node3.toString());

    }}
