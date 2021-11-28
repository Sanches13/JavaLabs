public class TestLinSort{
    public static void main(String[] args) {
        int input[] = new int[25];

        System.out.println("Random array with values from 0 to 10000:");
        for(int i = 0; i < input.length; i++) {
            input[i] = (int) (Math.random() * 10000);
            System.out.print(input[i] + " ");
        }
        System.out.println();

        LinSort.LSD(input);

        System.out.println("Data sorted by LSD sort:");
        for(int i = 0; i < input.length; i++)
            System.out.print(input[i] + " ");
        System.out.println();

        System.out.println("Random array with values from 0 to 10000:");
        for(int i = 0; i < input.length; i++) {
            input[i] = (int) (Math.random() * 10000);
            System.out.print(input[i] + " ");
        }
        System.out.println();

        LinSort.MSD(input);

        System.out.println("Data sorted by MSD sort:");
        for(int i = 0; i < input.length; i++)
            System.out.print(input[i] + " ");
        System.out.println();

        System.out.println("Random array with values from 0 to 10000:");
        for(int i = 0; i < input.length; i++) {
            input[i] = (int) (Math.random() * 10000);
            System.out.print(input[i] + " ");
        }
        System.out.println();

        LinSort.countingSort(input);

        System.out.println("Data sorted by counting sort:");
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
            LinSort.LSDSequence(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;23] sorted by LSD sort:");
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
            LinSort.MSDSequence(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;23] sorted by MSD sort:");
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
            LinSort.countingSortSequence(input, 1, 23);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data sequence [1;23] sorted by counting sort:");
        for(int i = 0; i < input.length; i++)
            System.out.print(input[i] + " ");
        System.out.println();
    }
}
