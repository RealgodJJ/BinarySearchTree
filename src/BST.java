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

    public boolean contains(T e) {
        return contains(root, e);
    }

    private boolean contains(Node node, T e) {
        if (node == null)
            return false;

        if (node.e.compareTo(e) == 0)
            return true;
        else if (node.e.compareTo(e) < 0)
            return contains(node.left, e);
        else
            return contains(node.right, e);
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null)
            return;

        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        generateBSTString(root, 0, stringBuilder);
        return stringBuilder.toString();
    }

    private void generateBSTString(Node node, int depth, StringBuilder result) {
        if (node == null) {
            result.append(generateDepthString(depth)).append("null\n");
            return;
        }

        result.append(generateDepthString(depth)).append(node.e).append("\n");
        generateBSTString(node.left, depth + 1, result);
        generateBSTString(node.right, depth + 1, result);
    }

    private String generateDepthString(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++)
            stringBuilder.append("--");
        return stringBuilder.toString();
    }
}
