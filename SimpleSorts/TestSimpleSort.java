public class TestSimpleSort{
    public static void printArray(int array[]){
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        //String[] array = {"b","a","j","d","b","a","j","k","d","a","j","s","d"};
        int array[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        printArray(array);
        try {
            SimpleSort.selectionSortSequence(array, 1, 8);
        }
        catch(Exception e){
        }
        printArray(array);

    }
}
