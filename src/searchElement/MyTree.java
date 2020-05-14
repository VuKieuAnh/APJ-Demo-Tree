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

    public Node insertRec(Node root, int key){
        if(root == null){
            root = new MyTree.Node(key);
            return root;
        }

        if(key < root.key){
            root.left = insertRec(root.left, key);
        }else if(key > root.key){
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void insert(int key){
        root = insertRec(root,key);
    }
}
