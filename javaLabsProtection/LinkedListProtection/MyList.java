public class MyList<T>{

    static class Node<T>{
        T data;
        Node<T> next;

        public Node(){
        }

        public T getData(){
            return data;
        }

        public Node<T> getNext(){
            return next;
        }

        public void setNext(Node<T> next){
            this.next = next;
        }

        public void setData(T data){
            this.data = data;
        }
    }

    Node<T> head;
    Node<T> tail;
    int size;

    public MyList(){
    }

    public MyList(MyList<T> copyOfList){
        Node<T> currentNode = copyOfList.head;
        while(currentNode != null){
            this.insertAtEnd(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    //inserting an element at the head of the list
    public void insertAtHead(T data){
        Node<T> newNode = new Node<T>();
        newNode.setData(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }

        else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    public void insertAtEnd(T data){
        Node<T> newNode = new Node<T>();
        newNode.setData(data);
        if(head == null){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void deleteAtBegin() throws Exception{
        if(size == 0 || head == null)
            throw new Exception("List is empty!");

        Node<T> currentNode = head;
        head = currentNode.next;
        currentNode = null;
        size--;
    }

    public void deleteByData(T data) throws Exception{
        if(size == 0 || head == null)
            throw new Exception("List is empty!");

        Node<T> currentNode = head;

        if(currentNode.data.equals(data) && size == 1){
            head = null;
            tail = null;
            size--;
            return;
        }
        if(currentNode.data.equals(data)){
            head = currentNode.next;
            currentNode = null;
            size--;
            return;
        }

        Node<T> prevNode = new Node<T>();
        while(!currentNode.data.equals(data)){
            prevNode = currentNode;
            if(currentNode.next == null){
                System.out.println("Element is not found");
                return;
            }
            currentNode = currentNode.next;
            if(currentNode.data.equals(data)){
                if(tail.data == data){
                    tail = prevNode;
                    tail.next = null;
                    size--;
                    return;
                }

                prevNode.next = currentNode.next;
                size--;
                return;
            }
        }
    }

    public int getSize(){
        return size;
    }

    public void deleteAll(){
        while(size != 0){
            try{
                deleteAtBegin();
            }
            catch (Exception e){
                System.out.println("Your list is empty!");
            }
        }
        tail = null;
        head = null;
    }

    //-------------
    public void printList(){
        Node<T> currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
    //-------------

    //inserting an element at a given index
    public void insertByIndex(int index, T data) throws Exception{
        if(index < 0 || index > size)
            throw new Exception("Incorrect value of index!");

        if(index == 0)
            insertAtHead(data);
        else if(index == size)
            insertAtEnd(data);
        else{
            Node<T> currentNode = head;
            for(int i = 0; i < index - 1; i++)
                currentNode = currentNode.next;
            Node<T> newNode = new Node<T>();
            newNode.data = data;
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            size++;
        }
    }
}
