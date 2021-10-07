public class TestTree{
    public static void main(String[] args) {
        MyTree<String> newTree = new MyTree<String>();
        newTree.insertElem("10");
        newTree.insertElem("20");
        newTree.insertElem("5");
        newTree.insertElem("1");
        newTree.insertElem("2");
        newTree.insertElem("16");
        newTree.insertElem("25");
        newTree.printTree(newTree.rootNode);
        System.out.println("-----------------");
        System.out.println("Size: " + newTree.size);
        System.out.println("-----------------");

        MyTree<String> second = new MyTree<String>(newTree);
        second.printTree(second.rootNode);
        System.out.println("-----------------");
        System.out.println("Size: " + second.size);
        System.out.println("-----------------");

        second.insertElem("1000");
        second.printTree(second.rootNode);
        System.out.println("-----------------");
        System.out.println("Size: " + second.size);
        System.out.println("-----------------");
        System.out.println(second.searchElem("11"));
        second.deleteAll();
        second.printTree(second.rootNode);
        System.out.println("Size: " + second.size);

    }
}
