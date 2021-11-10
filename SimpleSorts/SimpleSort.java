class SimpleSort{

    public static void bubbleSortInt(int array[]) throws Exception{
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        bubbleSortSequence(array, 0, array.length - 1);
    }

    public static void bubbleSortSequence(int array[], int begin, int end) throws Exception{
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        if(begin < 0 || begin >= end || end >= array.length)
            throw new Exception("Check your indices!");

        for(int i = begin; i < end; i++){
            for(int j = i + 1; j < end + 1; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void bubbleSortAll(T array[]) throws Exception{
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i].compareTo(array[j]) > 0){
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void insertionSortInt(int array[]) throws Exception{
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        insertionSortSequence(array, 0, array.length - 1);
    }

    public static void insertionSortSequence(int array[], int begin, int end) throws Exception{
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        if(begin < 0 || begin >= end || end >= array.length)
            throw new Exception("Check your indices!");

        for(int i = begin + 1; i < end + 1; i++){
            for(int j = i; j > begin && array[j] < array[j - 1]; j--){
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
    }

    public static <T extends Comparable<T>> void insertionSortAll(T array[]) throws Exception{
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        for(int i = 1; i < array.length; i++){
            for(int j = i; j > 0 && array[j].compareTo(array[j - 1]) < 0; j--){
                T temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
    }

    public static void selectionSortInt(int array[]) throws Exception{
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        selectionSortSequence(array, 0, array.length - 1);
    }

    public static void selectionSortSequence(int array[], int begin, int end) throws Exception{
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        if(begin < 0 || begin >= end || end >= array.length)
            throw new Exception("Check your indices!");

        for(int i = begin; i < end; i++){

            int index = i;
            for(int j = i + 1; j < end + 1; j++){
                if(array[j] < array[index])
                    index = j;
            }

            int min = array[index];
            array[index] = array[i];
            array[i] = min;
        }
    }

    public static <T extends Comparable<T>> void selectionSortAll(T array[]) throws Exception{
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        for(int i = 0; i < array.length - 1; i++){

            int index = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j].compareTo(array[i]) < 0)
                    index = j;
            }

            T min = array[index];
            array[index] = array[i];
            array[i] = min;
        }
    }
}
