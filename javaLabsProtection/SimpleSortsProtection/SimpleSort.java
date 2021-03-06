import java.util.Vector;

public class SimpleSort{

    public static void bubbleSort(int array[]) throws Exception{
        bubbleSort(array, 0, array.length - 1);
    }

    public static void bubbleSort(int array[], int begin, int end) throws Exception{
        if(begin < 0 || begin >= end || end >= array.length)
            throw new Exception("Check your indices!");

        for(int i = begin; i < end + 1; i++){
            for(int j = begin; j < end; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void bubbleSort(T array[]) throws Exception{
        bubbleSort(array, 0, array.length - 1);
    }

    public static <T extends Comparable<T>> void bubbleSort(T array[], int begin, int end) throws Exception{
        if(begin < 0 || begin >= end || end >= array.length)
            throw new Exception("Check your indices!");

        for(int i = begin; i < end + 1; i++){
            for(int j = begin; j < end; j++){
                if(array[j].compareTo(array[j + 1]) > 0){
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static <T extends Comparable<? super T>> void bubbleSort(Vector<T> vector){
        for(int i = 0; i < vector.size(); i++){
            for(int j = 0; j < vector.size() - 1; j++){
                if(vector.get(j).compareTo(vector.get(j + 1)) > 0){
                    T temp = vector.get(j);
                    vector.set(j, vector.get(j + 1));
                    vector.set(j + 1, temp);
                }
            }
        }
    }

    public static void insertionSort(int array[]) throws Exception{
        insertionSort(array, 0, array.length - 1);
    }

    public static void insertionSort(int array[], int begin, int end) throws Exception{
        if(begin < 0 || begin >= end || end >= array.length)
            throw new Exception("Check your indices!");

        for(int i = begin + 1; i < end + 1; i++){
            int currentElement = array[i];
            int j = i - 1;
            while(j >= begin && array[j] > currentElement){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentElement;
        }
    }

    public static <T extends Comparable<T>> void insertionSort(T array[]) throws Exception{
        insertionSort(array, 0, array.length - 1);
    }

    public static <T extends Comparable<T>> void insertionSort(T array[], int begin, int end) throws Exception{
        if(begin < 0 || begin >= end || end >= array.length)
            throw new Exception("Check your indices!");

        for(int i = begin + 1; i < end + 1; i++){
            T currentElement = array[i];
            int j = i - 1;
            while(j >= begin && array[j].compareTo(currentElement) > 0){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentElement;
        }
    }

    public static <T extends Comparable<? super T>> void insertionSort(Vector<T> vector){
        for(int i = 1; i < vector.size(); i++){
            T currentElement = vector.get(i);
            int j = i - 1;
            while(j >= 0 && vector.get(j).compareTo(currentElement) > 0){
                vector.set(j + 1, vector.get(j));
                j--;
            }
            vector.set(j + 1, currentElement);
        }
    }

    public static void selectionSort(int array[]) throws Exception{
        selectionSort(array, 0, array.length - 1);
    }

    public static void selectionSort(int array[], int begin, int end) throws Exception{
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

    public static <T extends Comparable<T>> void selectionSort(T array[]) throws Exception{
        selectionSort(array, 0, array.length - 1);
    }

    public static <T extends Comparable<T>> void selectionSort(T array[], int begin, int end) throws Exception{
        if(begin < 0 || begin >= end || end >= array.length)
            throw new Exception("Check your indices!");

        for(int i = begin; i < end; i++){

            int index = i;
            for(int j = i + 1; j < end + 1; j++){
                if(array[j].compareTo(array[index]) < 0)
                    index = j;
            }

            T min = array[index];
            array[index] = array[i];
            array[i] = min;
        }
    }

    public static <T extends Comparable<? super T>> void selectionSort(Vector<T> vector){
        for(int i = 0; i < vector.size() - 1; i++){

            int index = i;
            for(int j = i + 1; j < vector.size(); j++){
                if(vector.get(j).compareTo(vector.get(index)) < 0)
                    index = j;
            }

            T min = vector.get(index);
            vector.set(index, vector.get(i));
            vector.set(i, min);
        }
    }

    //Selection sort method for structure MyVector

    public static <T extends Comparable<? super T>> void selectionSort(MyVector<T> vector, String mode) throws Exception{
        for (int i = 0; i < vector.getCurrentSize() - 1; i++) {

            int index = i;
            for (int j = i + 1; j < vector.getCurrentSize(); j++) {
                switch (mode){
                    case "inc":
                        if (vector.get(j).compareTo(vector.get(index)) < 0)
                            index = j;
                        break;
                    case "dec":
                        if (vector.get(j).compareTo(vector.get(index)) > 0)
                            index = j;
                        break;
                    default:
                        throw new Exception("Error value mode!");
                }
            }

            T elem = vector.get(index);
            vector.set(index, vector.get(i));
            vector.set(i, elem);
        }
    }
}