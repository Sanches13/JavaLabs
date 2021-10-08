public class TestEffectiveSort{
    public static void printArray(int array[]){
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
	    int newArray[] = new int[10];
        for(int i = 0; i < 10; i++)
            newArray[i] = 10 - i;

        printArray(newArray);
        try {
            EffectiveSort.mergeSortInt(newArray);
        }
        catch(Exception e){
            System.out.println(e);
        }
        printArray(newArray);
    }
}
