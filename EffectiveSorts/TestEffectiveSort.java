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
            EffectiveSort.mergeSortInt(input);
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
            EffectiveSort.quickSortInt(input);
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

        try {
            EffectiveSort.heapSortInt(input);
        }
        catch(Exception e){
            System.out.println(e);
        }

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
            EffectiveSort.mergeSortSequence(input, 1, 23);
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
            EffectiveSort.quickSortSequence(input, 1, 23);
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
            EffectiveSort.heapSortSequence(input, 1, 23);
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
            strInput[i - 65] = "" + (char)i;
            System.out.print(strInput[i - 65] + " ");
        }
        System.out.println();

        try {
            EffectiveSort.mergeSortAll(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by mergeSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        for(int i = 90; i >= 65; i--)
            strInput[i - 65] = "" + (char)i;

        try {
            EffectiveSort.quickSortAll(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by quickSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();

        for(int i = 90; i >= 65; i--)
            strInput[i - 65] = "" + (char)i;

        try {
            EffectiveSort.heapSortAll(strInput);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sorted by heapSort:");
        for(int i = 0; i < strInput.length; i++)
            System.out.print(strInput[i] + " ");
        System.out.println();
    }
}
