public class TestBinaryTree{
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.insertElem(10);
        tree.insertElem(8);
        tree.insertElem(20);
        tree.insertElem(15);
        tree.insertElem(13);
        tree.insertElem(17);
        tree.insertElem(25);

        System.out.print("First tree: ");
        tree.printTree();
        System.out.println("--------------------");

        System.out.println("Difference between max and min element: " + tree.MaxMinDifference());
    }
}
