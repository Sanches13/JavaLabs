public class TestEffectiveSort{
    public static void printArray(int array[]){
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
	int input[] = new int[50];

        System.out.println("Input data:");
        for(int i = 0; i < input.length; i++) {
            input[i] = 50 - i;
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

        for(int i = 0; i < input.length; i++)
            input[i] = 50 - i;

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

        for(int i = 0; i < input.length; i++)
            input[i] = 50 - i;

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

        System.out.println("Input data:");
        for(int i = 0; i < input.length; i++) {
            input[i] = 50 - i;
            System.out.print(input[i] + " ");
        }
        System.out.println();

        try {
            EffectiveSort.mergeSortSequence(input, 1, 48);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;48] sorted by mergeSort:");
        for(int i = 0; i < input.length; i++)
            System.out.print(input[i] + " ");
        System.out.println();

        for(int i = 0; i < input.length; i++)
            input[i] = 50 - i;

        try {
            EffectiveSort.quickSortSequence(input, 1, 48);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;48] sorted by quickSort:");
        for(int i = 0; i < input.length; i++)
            System.out.print(input[i] + " ");
        System.out.println();

        for(int i = 0; i < input.length; i++)
            input[i] = 50 - i;

        try {
            EffectiveSort.heapSortSequence(input, 1, 48);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;48] sorted by heapSort:");
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
