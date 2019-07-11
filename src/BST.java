public class BST<T extends Comparable<T>> {

    private class Node {
        T e;
        Node left, right;

        private Node(T e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T e) {
//        if (root == null) {
//            root = new Node(e);
//            size++;
//        } else
        root = add(root, e);
    }

    private Node add(Node root, T e) {
        //先解决基本问题
//        if (root.e.equals(e)) {
//            return;
//        } else if (root.e.compareTo(e) < 0 && root.left == null) {
//            root.left = new Node(e);
//            size++;
//            return;
//        } else if (root.e.compareTo(e) > 0 && root.right == null) {
//            root.right = new Node(e);
//            size++;
//            return;
//        }

        if (root == null) {
            size++;
            return new Node(e);
        }

        if (root.e.compareTo(e) > 0)
            root.left = add(root.left, e);
        else if (root.e.compareTo(e) < 0)
            root.right = add(root.right, e);

        return root;
    }
}
