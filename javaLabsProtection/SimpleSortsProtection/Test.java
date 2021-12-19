public class Test {

    public static MyVector<Integer> generateRandomMyVector(){
        MyVector<Integer> randomArray = new MyVector<Integer>(16);
        for(int i = 0; i < 16; i++)
            randomArray.insertAtEnd((int) (Math.random() * 10000));
        return randomArray;
    }

    public static void main(String[] args) {
        MyVector<Integer> vector = generateRandomMyVector();

        System.out.println("First array:");
        vector.printVector();
        try {
            SimpleSort.selectionSort(vector, "inc");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Sort in increasing order:");
        vector.printVector();
        System.out.println();

        System.out.println("Second array:");
        vector = generateRandomMyVector();
        vector.printVector();
        try {
            SimpleSort.selectionSort(vector, "dec");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Sort in decreasing order:");
        vector.printVector();
    }
}
