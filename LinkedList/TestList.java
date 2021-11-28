public class TestList{
    public static void main(String[] args) {
        MyList<String> firstList = new MyList<String>();

        System.out.println("Fill the list using the method InsertAtHead():");
        for(int i = 77; i >= 65; i--){
            firstList.insertAtHead("" + (char)i);
        }
        firstList.printList();
        System.out.println("Current size of list: " + firstList.getSize());
        System.out.println("--------------------");

        System.out.println("Fill the list using the method InsertAtEnd():");
        for(int i = 78; i < 91; i++){
            firstList.insertAtEnd("" + (char)i);
        }
        firstList.printList();
        System.out.println("Current size of list: " + firstList.getSize());
        System.out.println("--------------------");

        System.out.println("Create a copy of the first list:");
        MyList<String> secondList = new MyList<String>(firstList);
        secondList.printList();
        System.out.println("Current size of list: " + secondList.getSize());
        System.out.println("--------------------");

        System.out.println("Delete the first 5 elements of copied list using method DeleteAtBegin():");
        for(int i = 0; i < 5; i++){
            try {
                secondList.deleteAtBegin();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        secondList.printList();
        System.out.println("Current size of list: " + secondList.getSize());
        System.out.println("--------------------");

        System.out.println("Delete the last 5 elements of copied list using method DeleteByData():");
        for(int i = 90; i > 85; i--){
            try {
                secondList.deleteByData("" + (char)i);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        secondList.printList();
        System.out.println("Current size of list: " + secondList.getSize());
        System.out.println("--------------------");

        System.out.println("Clear the copied list:");
        secondList.deleteAll();
        secondList.printList();
        System.out.println("Current size of list: " + secondList.getSize());
    }
}
