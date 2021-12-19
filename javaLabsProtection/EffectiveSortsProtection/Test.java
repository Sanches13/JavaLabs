import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int array[] = {16, 47, 13, 95, 5, 5, 5, 5, 3, 3, 3, 0, 1, 1, 2, 9};
        System.out.println(Arrays.toString(array));
        EffectiveSort.getMaxSubsequence(array);
        System.out.println();

        for(int i = 0; i < 16; i++)
            array[i] = 7;
        System.out.println(Arrays.toString(array));
        EffectiveSort.getMaxSubsequence(array);
        System.out.println();

        for(int i = 0; i < 16; i++)
            array[i] = i;
        System.out.println(Arrays.toString(array));
        EffectiveSort.getMaxSubsequence(array);
        System.out.println();
    }
}

