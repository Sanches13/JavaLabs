public class TestVector {

    public static void main(String[] args) {
        MyVector<Animal> firstVector = new MyVector<Animal>(10);
        MyVector<Animal> secondVector = new MyVector<Animal>(10);

        System.out.println("Fill the first vector:");
        firstVector.insertAtEnd(new Animal("Mouse", 1));
        firstVector.insertAtEnd(new Animal("Horse", 12));
        firstVector.insertAtEnd(new Animal("Dog", 7));
        firstVector.insertAtEnd(new Animal("Cat", 3));
        firstVector.printVector();

        System.out.println("Fill the second vector using the method reverseCopy()");
        firstVector.reverseCopy(secondVector);
        secondVector.printVector();
    }
}
