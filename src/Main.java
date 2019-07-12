public class Main {

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();

        bst.add(13);
        bst.add(3);
        bst.add(12);
        bst.add(31);
        bst.add(21);

        bst.preOrder();

        System.out.println();
        System.out.println(bst);

//        String a = new String("I love Pan.");
//        String b = a;
//        String c = new String("I love Pan.");
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
    }
}
