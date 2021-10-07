public class TestList{
    public static void main(String args[]){
    	MyList<String> newList = new MyList<String>();
        newList.insertAtHead("H");
        newList.insertAtHead("e");
        newList.insertAtHead("A");
        newList.insertAtEnd("l");
        newList.printList();
        System.out.println("--------------");
        System.out.println("head: " + newList.head.getData());
        System.out.println("tail: " + newList.tail.getData());
        System.out.println("--------------");
        MyList<String> second = new MyList<String>(newList);
        second.printList();
        System.out.println("--------------");
        second.insertAtHead("A");
        second.printList();
        System.out.println("--------------");
        System.out.println("head: " + second.head.getData());
        second.deleteAll();
        try {
            second.deleteAtBegin();
        }
        catch(Exception e){
            System.out.println("Your list is empty!");
        }
    }
}
