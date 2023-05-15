package Project1;

//public class Node {
//    Node left, right;
//    int data;
//    public Node(int data){
//        this.data=data;
//    }
//
//    public void insert(int value){
//        if(value<=data){
//            if(left==null){
//                left = new Node(value);
//            }
//        }else{
//            if(right==null){
//                right= new Node(value);
//            }else{
//                right.insert(value);
//            }
//        }
//    }
//
//    public void printInOrder(){
//        if(left!=null){
//            left.printInOrder();
//        }
//        System.out.println(data);
//        if(right != null){
//            right.printInOrder();
//        }
//    }
//
//}
class Node {
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}