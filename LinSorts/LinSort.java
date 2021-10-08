public class LinSort{
    private static int getMaxDigit(int max){
        int digit = 1;
        while(max / 10 != 0) {
            max = max / 10;
            digit++;
        }
        return digit;
    }

    private static int getDigit(int elem, int currentDigit){
        int number = 0, temp = elem;
        for(int i = 0; i < currentDigit; i++){
            number = temp % 10;
            temp = temp / 10;
        }
        return number;
    }

    private static int getMax(int array[], int begin, int end){
        int max = array[begin];
        for (int i = begin + 1; i < end; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static void LSD(int array[]){

        int max = getMax(array, 0, array.length);
        int digit = getMaxDigit(max);

        for(int i = 0; i < digit; i++){
            int digits[] = new int[10];
            for(int j = 0; j < 10; j++)
                digits[j] = 0;

            for(int j = 0; j < array.length; j++) {
                int number = getDigit(array[j], i + 1);
                digits[number]++;
            }

            int currentArray[] = new int[array.length];

            int count = 0;
            for(int j = 0; j < 10; j++) {
                int temp = digits[j];
                digits[j] = count;
                count += temp;
            }

            for(int j = 0; j < array.length; j++) {
                int number = getDigit(array[j], i + 1);
                currentArray[digits[number]] = array[j];
                digits[number]++;
            }

            for(int j = 0; j < array.length; j++) {
                array[j] = currentArray[j];
            }
        }
    }

    public static void countingSort(int array[]){
        int max = getMax(array, 0, array.length);

        int diapasonLength = max + 1;

        int diapason[] = new int[diapasonLength];
        for(int i = 0; i < diapasonLength; i++)
            diapason[i] = 0;

        for(int i = 0; i < array.length; i++){
            diapason[array[i]] = diapason[array[i]] + 1;
        }

        int currentArray[] = new int[array.length];

        int k = 0;
        for(int i = 0; i < diapasonLength; i++) {
            for(int j = 0; j < diapason[i]; j++) {
                currentArray[k] = i;
                k++;
            }
        }

        for(int i = 0; i < array.length; i++){
            array[i] = currentArray[i];
        }
    }

    public static void MSD(int array[]) {

        int max = getMax(array, 0, array.length);

        int digit = getMaxDigit(max);

        for (int i = 0; i < digit; i++) {
            int digits[] = new int[10];
            for (int j = 0; j < 10; j++)
                digits[j] = 0;

            for (int j = 0; j < array.length; j++) {
                int number = getDigit(array[j], digit - i + 1);
                digits[number]++;
            }

            int currentArray[] = new int[array.length];

            int count = 0;
            for (int j = 0; j < 10; j++) {
                int temp = digits[j];
                digits[j] = count;
                count += temp;
            }

            for (int j = 0; j < array.length; j++) {
                int number = getDigit(array[j], digit - i + 1);
                currentArray[digits[number]] = array[j];
                digits[number]++;
            }

            for (int j = 0; j < array.length; j++) {
                array[j] = currentArray[j];
            }
        }
    }

    public static void countingSortSequence(int array[], int begin, int end){
        int sequence[] = new int[end - begin + 1];
        for(int i = 0; i < sequence.length; i++)
            sequence[i] = array[begin + i];
        countingSort(sequence);
        for(int i = 0; i < sequence.length; i++)
            array[begin + i] = sequence[i];
    }

    public static void LSDSequence(int array[], int begin, int end) {
        int sequence[] = new int[end - begin + 1];
        for(int i = 0; i < sequence.length; i++)
            sequence[i] = array[begin + i];
        LSD(sequence);
        for(int i = 0; i < sequence.length; i++)
            array[begin + i] = sequence[i];
    }

    public static void MSDSequence(int array[], int begin, int end) {
        int sequence[] = new int[end - begin + 1];
        for(int i = 0; i < sequence.length; i++)
            sequence[i] = array[begin + i];
        MSD(sequence);
        for(int i = 0; i < sequence.length; i++)
            array[begin + i] = sequence[i];
    }
}

