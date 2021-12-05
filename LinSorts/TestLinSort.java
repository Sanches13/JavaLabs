import java.util.Arrays;

public class TestLinSort {

    public static int[] generateRandomArray(){
        int randomArray[] = new int[25];
        for(int i = 0; i < randomArray.length; i++)
            randomArray[i] = (int) (Math.random() * 10000);
        return randomArray;
    }

    public static void main(String[] args) {
        int input[] = generateRandomArray();

        System.out.println("Random array with values from 0 to 10000:");
        System.out.println(Arrays.toString(input));

        LinSort.LSD(input);

        System.out.println("Data sorted by LSD sort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        LinSort.MSD(input);

        System.out.println("Data sorted by MSD sort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        LinSort.countingSort(input);

        System.out.println("Data sorted by counting sort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        try {
            LinSort.LSD(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;23] sorted by LSD sort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        try {
            LinSort.MSD(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;23] sorted by MSD sort:");
        System.out.println(Arrays.toString(input) + "\n");

        System.out.println("Random array with values from 0 to 10000:");
        input = generateRandomArray();
        System.out.println(Arrays.toString(input));

        try {
            LinSort.countingSort(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data sequence [1;23] sorted by counting sort:");
        System.out.println(Arrays.toString(input) + "\n");
    }
}
