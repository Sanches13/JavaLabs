public class MyTree<T extends Comparable<T>>{

    class Node<T extends Comparable<T>>{
        T data;
        Node<T> left;
        Node<T> right;

        public Node(){
        }

        public Node(T data){
            this.data = data;
        }
    }

    Node<T> rootNode;
    int size;

    public MyTree() {
    }

    public MyTree(MyTree<T> copyOfTree) {
        rootNode = new Node<T>(copyOfTree.rootNode.data);
        size++;
        copyNode(rootNode, copyOfTree.rootNode);
    }

    private void copyNode(Node<T> thisNode, Node<T> copy){
        if (copy == null) return;
        if(copy.left != null) {
            thisNode.left = new Node<T>(copy.left.data);
            size++;
            copyNode(thisNode.left, copy.left);
        }
        if(copy.right != null) {
            thisNode.right = new Node<T>(copy.right.data);
            size++;
            copyNode(thisNode.right, copy.right);
        }
    }

    public void insertElem(T data){
        if(this.rootNode == null){
            rootNode = new Node<T>(data);
            size++;
            return;
        }

        insertElemTo(rootNode, data);
        size++;
    }

    private void insertElemTo(Node<T> current, T data){
        if(current == null){
            current = new Node<T>(data);
        }

        if(data.compareTo(current.data) < 0){
            if(current.left == null)
                current.left = new Node<T>(data);
            else
                insertElemTo(current.left, data);
        }

        else {
            if(current.right == null)
                current.right = new Node<T>(data);
            else
                insertElemTo(current.right, data);
        }
    }

    public boolean searchElem(T data){
        if(rootNode == null)
            return false;

        Node<T> currentNode;
        currentNode = rootNode;
        while(currentNode != null){
            if(currentNode.data.compareTo(data) != 0){
                if(data.compareTo(currentNode.data) < 0)
                    currentNode = currentNode.left;
                else
                    currentNode = currentNode.right;
            }
            else
                return true;
        }
        return false;
    }

    //------------
    public void printTree(Node<T> node){
        if (node == null) return;
        printTree(node.left);
        System.out.println(node.data);
        printTree(node.right);
    }
    //------------

    public void deleteAll(){
        if (rootNode == null) return;
        delete(rootNode.left);
        delete(rootNode.right);
        rootNode = null;
        size--;
    }

    private void delete(Node<T> node){
        if (node == null) return;
        delete(node.left);
        delete(node.right);
        node = null;
        size--;
    }
}
