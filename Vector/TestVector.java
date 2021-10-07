public class TestVector {

    public static void main(String[] args) {
        MyVector<Integer> newVector = new MyVector<Integer>(10);
        for(int i = 0; i < 10; i++)
            newVector.insertAtEnd(i + 10);
        System.out.println("Current size: " + newVector.getCurrentSize() + "; Max size: " + newVector.getMaxSize());
        newVector.printVector();
        try {
            newVector.deleteByIndex(5);
        }
        catch (Exception e){
        }

        System.out.println("Current size: " + newVector.getCurrentSize() + "; Max size: " + newVector.getMaxSize());
        newVector.printVector();
        try {
            newVector.insertByIndex(8, 111);
        }
        catch (Exception e){
        }
        System.out.println("Current size: " + newVector.getCurrentSize() + "; Max size: " + newVector.getMaxSize());
        newVector.printVector();

        System.out.println("_____________");
        try {
            newVector.deleteEndElem();
        }
        catch (Exception e){
        }
        MyVector<Integer> second = new MyVector<Integer>(newVector);
        second.printVector();
        System.out.println("Current size: " + second.getCurrentSize() + "; Max size: " + second.getMaxSize());
        try {
            for(int i = 0; i < 50; i++)
                second.insertByIndex(6, i + 222);
        }
        catch (Exception e){
            System.out.println("Error");
        }
        second.printVector();
        System.out.println("Current size: " + second.getCurrentSize() + "; Max size: " + second.getMaxSize());
    }
}
