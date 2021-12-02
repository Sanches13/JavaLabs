public class TestList {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        System.out.println("Fill in our list using the method insertAtHead:");
        for(int i = 20; i > 0; i--)
            list.insertAtHead(i);

        list.printList();
        System.out.println();
        try {
            System.out.println("Add an element 100 to the beginning of list using the method insertByIndex:");
            list.insertByIndex(0, 100);
            list.printList();
            System.out.println();

            System.out.println("Add an element 1000 to the end of list using the method insertByIndex:");
            list.insertByIndex(list.getSize(), 1000);
            list.printList();
            System.out.println();

            System.out.println("Add an element 300 at position 3 using the method insertByIndex:");
            list.insertByIndex(3, 300);
            list.printList();
            System.out.println();

            System.out.println("Add an element 400 at position size-3 using the method insertByIndex:");
            list.insertByIndex(list.getSize() - 3, 400);
            list.printList();
            System.out.println();

            System.out.println("Add an element 500 at position 10 using the method insertByIndex:");
            list.insertByIndex(10, 500);
            list.printList();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
