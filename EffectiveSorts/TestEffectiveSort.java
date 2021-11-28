import java.util.Vector;

public class TestEffectiveSort{
    public static void main(String[] args) {
        int input[] = new int[25];

        System.out.println("Random array with values from 0 to 10000:");
        for(int i = 0; i < input.length; i++) {
            input[i] = (int) (Math.random() * 10000);
            System.out.print(input[i] + " ");
        }
        System.out.println();

        try {
            EffectiveSort.mergeSort(input);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by mergeSort:");
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
            EffectiveSort.quickSort(input);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by quickSort:");
        for(int i = 0; i < input.length; i++)
            System.out.print(input[i] + " ");
        System.out.println();

        System.out.println("Random array with values from 0 to 10000:");
        for(int i = 0; i < input.length; i++) {
            input[i] = (int) (Math.random() * 10000);
            System.out.print(input[i] + " ");
        }
        System.out.println();

        EffectiveSort.heapSort(input);

        System.out.println("Data sorted by heapSort:");
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
            EffectiveSort.mergeSort(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;23] sorted by mergeSort:");
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
            EffectiveSort.quickSort(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;23] sorted by quickSort:");
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
            EffectiveSort.heapSort(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;23] sorted by heapSort:");
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
            EffectiveSort.mergeSort(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by mergeSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        for(int i = 90; i >= 65; i--)
            strInput[90 - i] = "" + (char)i;

        try {
            EffectiveSort.quickSort(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by quickSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        for(int i = 90; i >= 65; i--)
            strInput[90 - i] = "" + (char)i;

        EffectiveSort.heapSort(strInput);

        System.out.println("Data sorted by heapSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        for(int i = 90; i >= 65; i--)
            strInput[90 - i] = "" + (char)i;

        try {
            EffectiveSort.quickSort(strInput, 1, 24);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;25] sorted by quickSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        for(int i = 90; i >= 65; i--)
            strInput[90 - i] = "" + (char)i;

        try {
            EffectiveSort.mergeSort(strInput, 1, 24);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;25] sorted by mergeSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        for(int i = 90; i >= 65; i--)
            strInput[90 - i] = "" + (char)i;

        try {
            EffectiveSort.heapSort(strInput, 1, 25);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;25] sorted by heapSort:");
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

        try {
            EffectiveSort.quickSort(myVector);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Vector Data sorted by quickSort:");
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

        try {
            EffectiveSort.mergeSort(myVector);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Vector Data sorted by mergeSort:");
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

        EffectiveSort.heapSort(myVector);

        System.out.println("Vector Data sorted by heapSort:");
        for(int i = 0; i < 25; i++)
            System.out.print(myVector.get(i) + " ");
        System.out.println();
    }
}
