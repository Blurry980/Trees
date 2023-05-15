package Project1;


public class BinarySearchTree {

    // Class containing left and right child of
    // current node and key value


    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    BinarySearchTree(int value) {
        root = new Node(value);
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to
    // insert a new key in BST
    Node insertRec(Node root, int key) {
        // If the tree is empty return a new node
        if (root == null) {
            root = new Node(key);
            System.out.println("root.key being returned=" +root.key);
            //System.out.println("root being returned="+root +);

            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.key) {
            //System.out.println("root.left=" + root.left.key);

            root.left = insertRec(root.left, key);
            System.out.println("root.left=" + root.left.key);
            System.out.println("root.key= " + root.key);

        }

    else if (key > root.key) {
            root.right = insertRec(root.right, key);
            System.out.println("root.right=" + root.right.key);
            System.out.println("root.key= " + root.key);

        }

        // return the (unchanged) node pointer
        //System.out.println("root="+ root.key+ " root.left=" + root.left + " root.right=" + root.right + " key=" + key);
        System.out.println("root.key being returned="+root.key);
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder() {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

}
