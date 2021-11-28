import java.util.Vector;

public class TestSimpleSort{
    public static void main(String[] args) {
        int input[] = new int[25];

        System.out.println("Random array with values from 0 to 10000:");
        for(int i = 0; i < input.length; i++) {
            input[i] = (int) (Math.random() * 10000);
            System.out.print(input[i] + " ");
        }
        System.out.println();

        try {
            SimpleSort.bubbleSort(input);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by bubbleSort:");
        for(int i = 0; i < input.length; i++)
            System.out.print(input[i] + " ");
        System.out.println();

        System.out.println("Random array with values from 0 to 10000:");
        for(int i = 0; i < input.length; i++) {
            input[i] = (int) (Math.random() * 10000);
            System.out.print(input[i] + " ");
        }
        System.out.println();

        try {
            SimpleSort.insertionSort(input);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by insertionSort:");
        for(int i = 0; i < input.length; i++)
            System.out.print(input[i] + " ");
        System.out.println();

        System.out.println("Random array with values from 0 to 10000:");
        for(int i = 0; i < input.length; i++) {
            input[i] = (int) (Math.random() * 10000);
            System.out.print(input[i] + " ");
        }
        System.out.println();

        try {
            SimpleSort.selectionSort(input);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by SelectionSort:");
        for(int i = 0; i < input.length; i++)
            System.out.print(input[i] + " ");
        System.out.println();

        System.out.println("Random array with values from 0 to 10000:");
        for(int i = 0; i < input.length; i++) {
            input[i] = (int) (Math.random() * 10000);
            System.out.print(input[i] + " ");
        }
        System.out.println();

        try {
            SimpleSort.bubbleSort(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;23] sorted by bubbleSort:");
        for(int i = 0; i < input.length; i++)
            System.out.print(input[i] + " ");
        System.out.println();

        System.out.println("Random array with values from 0 to 10000:");
        for(int i = 0; i < input.length; i++) {
            input[i] = (int) (Math.random() * 10000);
            System.out.print(input[i] + " ");
        }
        System.out.println();

        try {
            SimpleSort.insertionSort(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;23] sorted by insertionSort:");
        for(int i = 0; i < input.length; i++)
            System.out.print(input[i] + " ");
        System.out.println();

        System.out.println("Random array with values from 0 to 10000:");
        for(int i = 0; i < input.length; i++) {
            input[i] = (int) (Math.random() * 10000);
            System.out.print(input[i] + " ");
        }
        System.out.println();

        try {
            SimpleSort.selectionSort(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;23] sorted by selectionSort:");
        for(int i = 0; i < input.length; i++)
            System.out.print(input[i] + " ");
        System.out.println();

        System.out.println("Input data:");
        String strInput[] = new String[26];
        for(int i = 90; i >= 65; i--){
            strInput[90 - i] = "" + (char)i;
            System.out.print(strInput[90 - i] + " ");
        }
        System.out.println();

        try {
            SimpleSort.bubbleSort(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by bubbleSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        for(int i = 90; i >= 65; i--)
            strInput[90 - i] = "" + (char)i;

        try {
            SimpleSort.insertionSort(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by insertionSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        for(int i = 90; i >= 65; i--)
            strInput[90 - i] = "" + (char)i;

        try {
            SimpleSort.selectionSort(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by selectionSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        for(int i = 90; i >= 65; i--)
            strInput[90 - i] = "" + (char)i;

        try {
            SimpleSort.bubbleSort(strInput, 1, 24);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;25] sorted by bubbleSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        for(int i = 90; i >= 65; i--)
            strInput[90 - i] = "" + (char)i;

        try {
            SimpleSort.insertionSort(strInput, 1, 24);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;25] sorted by insertionSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        for(int i = 90; i >= 65; i--)
            strInput[90 - i] = "" + (char)i;

        try {
            SimpleSort.selectionSort(strInput, 1, 24);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;25] sorted by selectionSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        Vector<Integer> myVector = new Vector<>();
        System.out.println("Random array with values from 0 to 10000:");
        for(int i = 0; i < 25; i++) {
            myVector.add((int) (Math.random() * 10000));
            System.out.print(myVector.get(i) + " ");
        }
        System.out.println();

        SimpleSort.bubbleSort(myVector);

        System.out.println("Vector Data sorted by bubbleSort:");
        for(int i = 0; i < 25; i++)
            System.out.print(myVector.get(i) + " ");
        System.out.println();

        myVector.clear();
        System.out.println("Random array with values from 0 to 10000:");
        for(int i = 0; i < 25; i++) {
            myVector.add((int) (Math.random() * 10000));
            System.out.print(myVector.get(i) + " ");
        }
        System.out.println();

        SimpleSort.insertionSort(myVector);

        System.out.println("Vector Data sorted by insertionSort:");
        for(int i = 0; i < 25; i++)
            System.out.print(myVector.get(i) + " ");
        System.out.println();

        myVector.clear();
        System.out.println("Random array with values from 0 to 10000:");
        for(int i = 0; i < 25; i++) {
            myVector.add((int) (Math.random() * 10000));
            System.out.print(myVector.get(i) + " ");
        }
        System.out.println();

        SimpleSort.selectionSort(myVector);

        System.out.println("Vector Data sorted by selectionSort:");
        for(int i = 0; i < 25; i++)
            System.out.print(myVector.get(i) + " ");
        System.out.println();
    }
}
