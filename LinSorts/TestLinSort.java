public class TestLinSort{
    public static void main(String[] args) {
	int array[] = {92, 29, 38, 47, 56, 65, 74, 83, 1, 10};
        //int array[] = new int[10];
        for(int i = 0; i < 10; i++){
            //array[i] = 5000 - i*10;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        LinSort.countingSortSequence(array, 1, 8);
        for(int i = 0; i < 10; i++){
            System.out.print(array[i] + " ");
        }
    }
}
