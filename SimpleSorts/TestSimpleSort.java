import java.util.Arrays;
import java.util.Vector;

public class TestSimpleSort {

    public static int[] generateRandomArray(){
        int randomArray[] = new int[25];
        for(int i = 0; i < randomArray.length; i++)
            randomArray[i] = (int) (Math.random() * 10000);
        return randomArray;
    }

    public static String[] generateStringArray(){
        String strInput[] = new String[26];
        for(int i = 90; i >= 65; i--)
            strInput[90 - i] = "" + (char)i;
        return strInput;
    }

    public static Vector<Integer> generateRandomVector(){
        Vector<Integer> randomArray = new Vector<>();
        for(int i = 0; i < 25; i++)
            randomArray.add((int) (Math.random() * 10000));
        return randomArray;
    }

    public static void main(String[] args) {
        int input[] = generateRandomArray();

        System.out.println("Random array with values from 0 to 10000:");
        System.out.println(Arrays.toString(input));

        try {
            SimpleSort.bubbleSort(input);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by bubbleSort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        try {
            SimpleSort.insertionSort(input);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by insertionSort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        try {
            SimpleSort.selectionSort(input);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by SelectionSort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        try {
            SimpleSort.bubbleSort(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;23] sorted by bubbleSort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        try {
            SimpleSort.insertionSort(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;23] sorted by insertionSort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        try {
            SimpleSort.selectionSort(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;23] sorted by selectionSort:");
        System.out.println(Arrays.toString(input) + "\n");

        String strInput[] = generateStringArray();
        System.out.println("Input data:");
        System.out.println(Arrays.toString(strInput));

        try {
            SimpleSort.bubbleSort(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by bubbleSort:");
        System.out.println(Arrays.toString(strInput) + "\n");

        strInput = generateStringArray();

        try {
            SimpleSort.insertionSort(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by insertionSort:");
        System.out.println(Arrays.toString(strInput) + "\n");

        strInput = generateStringArray();

        try {
            SimpleSort.selectionSort(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by selectionSort:");
        System.out.println(Arrays.toString(strInput) + "\n");

        strInput = generateStringArray();

        try {
            SimpleSort.bubbleSort(strInput, 1, 24);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;25] sorted by bubbleSort:");
        System.out.println(Arrays.toString(strInput) + "\n");

        strInput = generateStringArray();

        try {
            SimpleSort.insertionSort(strInput, 1, 24);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;25] sorted by insertionSort:");
        System.out.println(Arrays.toString(strInput) + "\n");

        strInput = generateStringArray();

        try {
            SimpleSort.selectionSort(strInput, 1, 24);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;25] sorted by selectionSort:");
        System.out.println(Arrays.toString(strInput) + "\n");

        Vector<Integer> myVector = generateRandomVector();
        System.out.println("Random array with values from 0 to 10000:");
        System.out.println(myVector.toString());

        SimpleSort.bubbleSort(myVector);

        System.out.println("Vector Data sorted by bubbleSort:");
        System.out.println(myVector.toString() + "\n");

        myVector.clear();
        System.out.println("Random array with values from 0 to 10000:");
        myVector = generateRandomVector();
        System.out.println(myVector.toString());

        SimpleSort.insertionSort(myVector);

        System.out.println("Vector Data sorted by insertionSort:");
        System.out.println(myVector.toString() + "\n");

        myVector.clear();
        System.out.println("Random array with values from 0 to 10000:");
        myVector = generateRandomVector();
        System.out.println(myVector.toString());

        SimpleSort.selectionSort(myVector);

        System.out.println("Vector Data sorted by selectionSort:");
        System.out.println(myVector.toString() + "\n");
    }
}
