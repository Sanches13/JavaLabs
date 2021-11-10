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
            SimpleSort.bubbleSortInt(input);
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
            SimpleSort.insertionSortInt(input);
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
            SimpleSort.selectionSortInt(input);
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
            SimpleSort.bubbleSortSequence(input, 1, 23);
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
            SimpleSort.insertionSortSequence(input, 1, 23);
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
            SimpleSort.selectionSortSequence(input, 1, 23);
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
            strInput[i - 65] = "" + (char)i;
            System.out.print(strInput[i - 65] + " ");
        }
        System.out.println();

        try {
            SimpleSort.bubbleSortAll(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by bubbleSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        for(int i = 90; i >= 65; i--)
            strInput[i - 65] = "" + (char)i;

        try {
            SimpleSort.insertionSortAll(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by insertionSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        for(int i = 90; i >= 65; i--)
            strInput[i - 65] = "" + (char)i;

        try {
            SimpleSort.selectionSortAll(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by selectionSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();
    }
}
