public class TestBinaryTree{
    public static void main(String[] args) {
        BinaryTree<Integer> firstTree = new BinaryTree<Integer>();
        firstTree.insertElem(100);
        firstTree.insertElem(50);
        firstTree.insertElem(150);
        firstTree.insertElem(200);
        firstTree.insertElem(1);
        firstTree.insertElem(10);
        firstTree.insertElem(25);
        firstTree.insertElem(75);
        firstTree.insertElem(125);
        firstTree.insertElem(110);
        System.out.print("First tree: ");
        firstTree.printTree();
        System.out.println("--------------------");
        BinaryTree<Integer> secondTree = new BinaryTree<Integer>(firstTree);
        System.out.print("Second tree: ");
        secondTree.printTree();
        System.out.println("--------------------");

        System.out.println("Copy constructor check");
        System.out.println("First Tree");
        System.out.println("Parent: " + firstTree.rootNode.data + ": left child: " + firstTree.rootNode.left.data + "; right child: " + firstTree.rootNode.right.data);
        System.out.println("Parent: " + firstTree.rootNode.left.data + ": left child: " + firstTree.rootNode.left.left.data + "; right child: " + firstTree.rootNode.left.right.data);
        System.out.println("Parent: " + firstTree.rootNode.right.data + ": left child: " + firstTree.rootNode.right.left.data + "; right child: " + firstTree.rootNode.right.right.data);
        System.out.println("Parent: " + firstTree.rootNode.left.left.data + ": right child: " + firstTree.rootNode.left.left.right.data);
        System.out.println("Parent: " + firstTree.rootNode.right.left.data + ": left child: " + firstTree.rootNode.right.left.left.data);
        System.out.println("Parent: " + firstTree.rootNode.left.left.right.data + ": right child: " + firstTree.rootNode.left.left.right.right.data);

        System.out.println("--------------------");
        System.out.println("Second Tree");
        System.out.println("Parent: " + secondTree.rootNode.data + ": left child: " + secondTree.rootNode.left.data + "; right child: " + secondTree.rootNode.right.data);
        System.out.println("Parent: " + secondTree.rootNode.left.data + ": left child: " + secondTree.rootNode.left.left.data + "; right child: " + secondTree.rootNode.left.right.data);
        System.out.println("Parent: " + secondTree.rootNode.right.data + ": left child: " + secondTree.rootNode.right.left.data + "; right child: " + secondTree.rootNode.right.right.data);
        System.out.println("Parent: " + secondTree.rootNode.left.left.data + ": right child: " + secondTree.rootNode.left.left.right.data);
        System.out.println("Parent: " + secondTree.rootNode.right.left.data + ": left child: " + secondTree.rootNode.right.left.left.data);
        System.out.println("Parent: " + secondTree.rootNode.left.left.right.data + ": right child: " + secondTree.rootNode.left.left.right.right.data);
        System.out.println("--------------------");

        System.out.println("SearchElem() method check:");
        System.out.println("Element 1000 is in the first tree: " + secondTree.searchElem(1000));
        System.out.println("Element 200 is in the first tree: " + secondTree.searchElem(200));
        System.out.println("Element 10 is in the second tree: " + secondTree.searchElem(10));
        System.out.println("Element 11 is in the second tree: " + secondTree.searchElem(11));

        firstTree.deleteAll();
        firstTree.printTree();

    }
}
