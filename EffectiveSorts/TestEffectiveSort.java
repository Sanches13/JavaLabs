import java.util.Arrays;
import java.util.Vector;

public class TestEffectiveSort {

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
            EffectiveSort.mergeSort(input);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by mergeSort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        try {
            EffectiveSort.quickSort(input);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by quickSort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        EffectiveSort.heapSort(input);

        System.out.println("Data sorted by heapSort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        try {
            EffectiveSort.mergeSort(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;23] sorted by mergeSort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        try {
            EffectiveSort.quickSort(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;23] sorted by quickSort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        try {
            EffectiveSort.heapSort(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;23] sorted by heapSort:");
        System.out.println(Arrays.toString(input) + "\n");

        String strInput[] = generateStringArray();
        System.out.println("Input data:");
        System.out.println(Arrays.toString(strInput));

        try {
            EffectiveSort.mergeSort(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by mergeSort:");
        System.out.println(Arrays.toString(strInput) + "\n");

        strInput = generateStringArray();

        try {
            EffectiveSort.quickSort(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by quickSort:");
        System.out.println(Arrays.toString(strInput) + "\n");

        strInput = generateStringArray();

        EffectiveSort.heapSort(strInput);

        System.out.println("Data sorted by heapSort:");
        System.out.println(Arrays.toString(strInput) + "\n");

        strInput = generateStringArray();

        try {
            EffectiveSort.quickSort(strInput, 1, 24);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;25] sorted by quickSort:");
        System.out.println(Arrays.toString(strInput) + "\n");

        strInput = generateStringArray();

        try {
            EffectiveSort.mergeSort(strInput, 1, 24);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;25] sorted by mergeSort:");
        System.out.println(Arrays.toString(strInput) + "\n");

        strInput = generateStringArray();

        try {
            EffectiveSort.heapSort(strInput, 1, 25);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;25] sorted by heapSort:");
        System.out.println(Arrays.toString(strInput) + "\n");

        Vector<Integer> myVector = generateRandomVector();
        System.out.println("Random array with values from 0 to 10000:");
        System.out.println(myVector.toString());

        try {
            EffectiveSort.quickSort(myVector);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Vector Data sorted by quickSort:");
        System.out.println(myVector.toString() + "\n");

        myVector.clear();
        System.out.println("Random array with values from 0 to 10000:");
        myVector = generateRandomVector();
        System.out.println(myVector.toString());

        try {
            EffectiveSort.mergeSort(myVector);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Vector Data sorted by mergeSort:");
        System.out.println(myVector.toString() + "\n");

        myVector.clear();
        System.out.println("Random array with values from 0 to 10000:");
        myVector = generateRandomVector();
        System.out.println(myVector.toString());

        EffectiveSort.heapSort(myVector);

        System.out.println("Vector Data sorted by heapSort:");
        System.out.println(myVector.toString() + "\n");
    }
}
