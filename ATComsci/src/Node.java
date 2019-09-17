public class Node<T> {
   private T data;
   private Node<T> front;
   private Node<T> back;

    public Node (){
        this.front = null;
        this.back = null;
        this.data = null;
    }

    public Node (T t){
        this.front = null;
        this.back = null;
        this.data = t;
    }
   public Node (Node f, Node b, T t){
       this.front = f;
       this.back = b;
       this.data = t;
   }

    public void setData(T t){this.data = t;}
    public T getData(){return data;}

    public void setFront(Node<T> one){this.front = one;}
    public Node<T> getFront(){return front;}

    public void setBack(Node<T> two){this.back = two;}
    public Node<T> getBack(){return back;}

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