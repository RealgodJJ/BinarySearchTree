import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();

        bst.add(13);
        bst.add(3);
        bst.add(12);
        bst.add(31);
        bst.add(21);
        bst.add(18);
        bst.add(19);
        bst.add(29);
        bst.add(25);
        bst.add(30);
        bst.add(5);
        bst.add(7);

        System.out.println("13的排位是： " + bst.rank(13));
        System.out.println("25的排位是： " + bst.rank(25));
        System.out.println("30的排位是： " + bst.rank(30));
        System.out.println(bst);
        System.out.println("排位为5元素是：" + bst.select(5));

        bst.remove(3);
        System.out.println("13的排位是： " + bst.rank(13));
        System.out.println("25的排位是： " + bst.rank(25));
        System.out.println("30的排位是： " + bst.rank(30));
        System.out.println(bst);
        System.out.println("排位为5元素是：" + bst.select(5));

        bst.remove(31);
        System.out.println("13的排位是： " + bst.rank(13));
        System.out.println("25的排位是： " + bst.rank(25));
        System.out.println("30的排位是： " + bst.rank(30));
        System.out.println(bst);
        System.out.println("排位为5元素是：" + bst.select(5));

        bst.remove(7);
        System.out.println("13的排位是： " + bst.rank(13));
        System.out.println("25的排位是： " + bst.rank(25));
        System.out.println("30的排位是： " + bst.rank(30));
        System.out.println(bst);
        System.out.println("排位为5元素是：" + bst.select(5));

        bst.remove(21);
        System.out.println("13的排位是： " + bst.rank(13));
        System.out.println("25的排位是： " + bst.rank(25));
        System.out.println("30的排位是： " + bst.rank(30));
        System.out.println(bst);
        System.out.println("排位为5元素是：" + bst.select(5));

        System.out.println("天花板数是：" + bst.ceil(20));
        System.out.println("地板数是：" + bst.floor(20));


        System.out.println("=== 前序遍历 ===");
        bst.preOrder();

        System.out.println("=== 前序遍历（非递归） ===");
        bst.preOrderWithoutRecursion();

        System.out.println("=== 中序遍历 ===");
        bst.inOrder();

        System.out.println("=== 后序遍历 ===");
        bst.postOrder();

        System.out.println("=== 广度优先遍历 ===");
        bst.levelOrder();

        System.out.println("最大值：" + bst.maximum());
        System.out.println("最小值：" + bst.minimum());

//        System.out.println("===========================");
//        BST<Integer> newBst = new BST<>();
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            newBst.add(random.nextInt(20));
//        }
//        System.out.println(newBst);
//        System.out.println("最大值：" + newBst.maximum());
//        System.out.println("最小值：" + newBst.minimum());
//
//        int size = newBst.getSize();
//        System.out.println("Tree size: " + size);
//
//        for (int i = 0; i < size; i++) {
////            System.out.println(newBst.removeMin());
//            System.out.println(newBst.removeMax());
//        }
//        String a = new String("I love Pan.");
//        String b = a;
//        String c = new String("I love Pan.");
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
    }
}
