public class TestVector {

    public static void main(String[] args) {
        MyVector<String> firstVector = new MyVector<String>(10);
        System.out.println("Fill the vector using the method InsertByIndex():");
        for (int i = 65; i < 78; i++){
            try {
                firstVector.insertByIndex(i - 65, "" + (char) i);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
        firstVector.printVector();
        System.out.println("Current size: " + firstVector.getCurrentSize() + "; Max size: " + firstVector.getMaxSize());
        System.out.println("--------------------");

        System.out.println("Create a copy of the first vector:");
        MyVector<String> secondVector = new MyVector<String>(firstVector);
        System.out.println("Fill the copy of the first vector using the method InsertAtEnd():");
        for(int i = 78; i < 91; i++){
            try {
                secondVector.insertAtEnd( "" + (char) i);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
        secondVector.printVector();
        System.out.println("Current size: " + secondVector.getCurrentSize() + "; Max size: " + secondVector.getMaxSize());
        System.out.println("--------------------");

        System.out.println("Delete the first and the last 5 elements of copied vector using methods DeleteEndElem() and DeleteByIndex():");
        for(int i = 0; i < 5; i++){
            try {
                secondVector.deleteEndElem();
                secondVector.deleteByIndex(0);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }

        secondVector.printVector();
        System.out.println("Current size: " + secondVector.getCurrentSize() + "; Max size: " + secondVector.getMaxSize());
        System.out.println("--------------------");

        System.out.println("Clear the copied list:");
        secondVector.deleteAll();
        secondVector.printVector();
        System.out.println("Current size: " + secondVector.getCurrentSize() + "; Max size: " + secondVector.getMaxSize());
        System.out.println("--------------------");

        System.out.println("Create a third vector of size N = 10 and add the number of elements equal to M = 100");
        MyVector<Integer> thirdVector = new MyVector<Integer>(10);
        for(int i = 0; i < 100; i++)
            thirdVector.insertAtEnd(i);
        thirdVector.printVector();
        System.out.println("Current size: " + thirdVector.getCurrentSize() + "; Max size: " + thirdVector.getMaxSize());
        System.out.println("--------------------");
    }
}

