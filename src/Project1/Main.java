package Project1;
import java.io.*;

public class Main {

    //public static void main(String[] args) {
//       Node root = new Node(100);
//        root.left = new Node(20);
//        root.left.left = new Node(10);
//        root.right = new Node(500);
//        root.left.right = new Node(30);
//        root.right.left = new Node(15);
//        root.right.right = new Node(8);
        //root.printInOrder();
        //root.insert(12);
        //root.insert(7);
        //root.insert(30);
//        root.insert(50);
//        root.insert(15);
//        root.insert(20);
//        root.insert(10);
//        root.insert(40);
//        root.insert(60);
         //root.printInOrder();
   // }




        // Driver Code
        public static void main(String[] args)
        {
            BinarySearchTree tree = new BinarySearchTree();
            tree.insert(50);
            tree.insert(30);
            tree.insert(20);
            tree.insert(40);
            tree.insert(70);
            tree.insert(60);
            tree.insert(80);

            // Print inorder traversal of the BST
            tree.inorder();
        }
    }

