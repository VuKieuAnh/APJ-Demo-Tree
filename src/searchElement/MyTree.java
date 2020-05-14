package searchElement;

public class MyTree {
    class Node{
        int key;
        MyTree.Node left, right;

        public Node(int key) {
            this.key = key;
            left= null;
            right = null;
        }

    }
    Node root;

    public MyTree() {
        root = null;
    }
    //Average case: time: O(log(n), space:O(1)
    //Worst case: time: O(n), space:O(1)
    public Node insertRec(Node root, int key) {
        Node currentNode = root;
        while (true) {
            if (key < currentNode.key) {
                if (currentNode.left == null) {
                    Node newNode = new Node(key);
                    currentNode.left = newNode;
                    break;
                }
                else {
                    currentNode = currentNode.left;
                }
            }
            else {
                if (currentNode.right == null) {
                    Node newNode = new Node(key);
                    currentNode.right = newNode;
                    break;
                }
                else {
                    currentNode = currentNode.right;
                }
            }
        }
        return root;
    }
    public void insert(int key) {
        root = insertRec(root, key);
    }

    //average case: time: O(log(n)), space: O(log(n))
    //worst case: time: O(n), space: O(n)
//    public Node insertRec(Node root, int key){
//        if(root == null){
//            return new Node(key);
//            //root = new Node(key);
//            //return root;
//        }
//
//        if(key < root.key){
//            root.left = insertRec(root.left, key);
//        }else if(key > root.key){
//            root.right = insertRec(root.right, key);
//        }
//
//        return root;
//    }
//    public void insert(int key){
//        root = insertRec(root,key);
//    }
}

