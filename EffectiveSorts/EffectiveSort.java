import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class EffectiveSort{

    public static void quickSort(int array[]) throws Exception {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int array[], int begin, int end) throws Exception{
        if(begin < 0 || begin >= end || end >= array.length)
            throw new Exception("Check your indices!");

        int middle = begin + (end - begin) / 2;

        int left = begin;
        int right = end;
        int middleElement = array[middle];

        while(left <= right){
            while(array[left] < middleElement)
                left++;
            while(array[right] > middleElement)
                right--;

            if(left <= right){
                int swap = array[left];
                array[left] = array[right];
                array[right] = swap;
                left++;
                right--;
            }
        }

        if(begin < right)
            quickSort(array, begin, right);
        if(left < end)
            quickSort(array, left, end);
    }

    public static <T extends Comparable<T>> void quickSort(T array[]) throws Exception{
        quickSort(array, 0, array.length - 1);
    }

    public static <T extends Comparable<T>> void quickSort(T array[], int begin, int end) throws Exception{
        if(begin < 0 || begin >= end || end >= array.length)
            throw new Exception("Check your indices!");

        int middle = begin + (end - begin) / 2;

        int left = begin;
        int right = end;
        T middleElement = array[middle];

        while(left <= right){
            while(array[left].compareTo(middleElement) < 0)
                left++;
            while(array[right].compareTo(middleElement) > 0)
                right--;

            if(left <= right){
                T swap = array[left];
                array[left] = array[right];
                array[right] = swap;
                left++;
                right--;
            }
        }

        if(begin < right)
            quickSort(array, begin, right);
        if(left < end)
            quickSort(array, left, end);
    }

    public static <T extends Comparable<? super T>> void quickSort(Vector<T> vector) throws Exception{
        quickSort(vector, 0, vector.size() - 1);
    }

    private static <T extends Comparable<? super T>> void quickSort(Vector<T> vector, int begin, int end) throws Exception{
        if(begin < 0 || begin >= end || end >= vector.size())
            throw new Exception("Check your indices!");

        int middle = begin + (end - begin) / 2;

        int left = begin;
        int right = end;
        T middleElement = vector.get(middle);

        while(left <= right){
            while(vector.get(left).compareTo(middleElement) < 0)
                left++;
            while(vector.get(right).compareTo(middleElement) > 0)
                right--;

            if(left <= right){
                T swap = vector.get(left);
                vector.set(left, vector.get(right));
                vector.set(right, swap);
                left++;
                right--;
            }
        }

        if(begin < right)
            quickSort(vector, begin, right);
        if(left < end)
            quickSort(vector, left, end);
    }

    public static void mergeSort(int array[]) throws Exception{
        mergeSort(array, 0, array.length - 1);
    }

    public static void mergeSort(int array[], int begin, int end) throws Exception{
        if(begin >= end)
            return;

        if(begin < 0 || end >= array.length)
            throw new Exception("Check your indices!");

        int middle = begin + (end - begin) / 2;
        mergeSort(array, begin, middle);
        mergeSort(array, middle + 1, end);
        merge(array, begin, middle, end);
    }

    private static void merge(int array[], int begin, int middle, int end){
        int leftSize = middle - begin + 1;
        int rightSize = end - middle;

        int leftPart[] = new int[leftSize];
        int rightPart[] = new int[rightSize];

        for(int i = 0; i < leftSize; i++){
            leftPart[i] = array[begin + i];
        }

        for(int i = 0; i < rightSize; i++){
            rightPart[i] = array[middle + 1 + i];
        }

        int left = 0;
        int right = 0;
        int current = begin;
        while(left < leftSize && right < rightSize){
            if(leftPart[left] <= rightPart[right]){
                array[current] = leftPart[left];
                left++;
            }

            else{
                array[current] = rightPart[right];
                right++;
            }

            current++;
        }

        while(left < leftSize){
            array[current] = leftPart[left];
            left++;
            current++;
        }

        while(right < rightSize){
            array[current] = rightPart[right];
            right++;
            current++;
        }
    }

    public static <T extends Comparable<T>> void mergeSort(T array[]) throws Exception{
        mergeSort(array, 0, array.length - 1);
    }

    public static <T extends Comparable<T>> void mergeSort(T array[], int begin, int end) throws Exception{
        if(begin >= end)
            return;

        if(begin < 0 || end >= array.length)
            throw new Exception("Check your indices!");

        int middle = begin + (end - begin) / 2;
        mergeSort(array, begin, middle);
        mergeSort(array, middle + 1, end);
        merge(array, begin, middle, end);
    }

    private static <T extends Comparable<T>> void merge(T array[], int begin, int middle, int end){
        int leftSize = middle - begin + 1;
        int rightSize = end - middle;

        List<T> leftPart = new ArrayList<>(leftSize);
        List<T> rightPart = new ArrayList<>(rightSize);

        for(int i = 0; i < leftSize; i++){
            leftPart.add(array[begin + i]);
        }

        for(int i = 0; i < rightSize; i++){
            rightPart.add(array[middle + 1 + i]);
        }

        int left = 0;
        int right = 0;
        int current = begin;
        while(left < leftSize && right < rightSize){
            if(leftPart.get(left).compareTo(rightPart.get(right)) <= 0){
                array[current] = leftPart.get(left);
                left++;
            }

            else{
                array[current] = rightPart.get(right);
                right++;
            }

            current++;
        }

        while(left < leftSize){
            array[current] = leftPart.get(left);
            left++;
            current++;
        }

        while(right < rightSize){
            array[current] = rightPart.get(right);
            right++;
            current++;
        }
    }

    public static <T extends Comparable<? super T>> void mergeSort(Vector<T> vector) throws Exception{
        mergeSort(vector, 0, vector.size() - 1);
    }

    public static <T extends Comparable<? super T>> void mergeSort(Vector<T> vector, int begin, int end) throws Exception{
        if(begin >= end)
            return;

        if(begin < 0 || end >= vector.size())
            throw new Exception("Check your indices!");

        int middle = begin + (end - begin) / 2;
        mergeSort(vector, begin, middle);
        mergeSort(vector, middle + 1, end);
        merge(vector, begin, middle, end);
    }

    private static <T extends Comparable<? super T>> void merge(Vector<T> vector, int begin, int middle, int end){
        int leftSize = middle - begin + 1;
        int rightSize = end - middle;

        List<T> leftPart = new ArrayList<>(leftSize);
        List<T> rightPart = new ArrayList<>(rightSize);

        for(int i = 0; i < leftSize; i++){
            leftPart.add(vector.get(begin + i));
        }

        for(int i = 0; i < rightSize; i++){
            rightPart.add(vector.get(middle + 1 + i));
        }

        int left = 0;
        int right = 0;
        int current = begin;
        while(left < leftSize && right < rightSize){
            if(leftPart.get(left).compareTo(rightPart.get(right)) <= 0){
                vector.set(current, leftPart.get(left));
                left++;
            }

            else{
                vector.set(current, rightPart.get(right));
                right++;
            }

            current++;
        }

        while(left < leftSize){
            vector.set(current, leftPart.get(left));
            left++;
            current++;
        }

        while(right < rightSize){
            vector.set(current, rightPart.get(right));
            right++;
            current++;
        }
    }

    public static void heapSort(int array[]){
        for(int i = (array.length / 2) - 1; i >= 0; i--){
            toHeap(array, array.length, i);
        }

        for(int i = array.length - 1; i > 0; i--){
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            toHeap(array, i, 0);
        }
    }

    public static void heapSort(int array[], int begin, int end) throws Exception{
        if(begin < 0 || begin >= end || end >= array.length)
            throw new Exception("Check your indices!");

        int sequence[] = new int[end - begin + 1];
        for(int i = 0; i < sequence.length; i++)
            sequence[i] = array[begin + i];

        heapSort(sequence);

        for(int i = 0; i < sequence.length; i++)
            array[begin + i] = sequence[i];
    }

    private static void toHeap(int array[], int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && array[largest] < array[left]){
            largest = left;
        }

        if(right < n && array[largest] < array[right]){
            largest = right;
        }

        if(largest != i){
            int temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;

            toHeap(array, n, largest);
        }
    }

    public static <T extends Comparable<T>> void heapSort(T array[]){
        for(int i = (array.length / 2) - 1; i >= 0; i--){
            toHeap(array, array.length, i);
        }

        for(int i = array.length - 1; i > 0; i--){
            T temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            toHeap(array, i, 0);
        }
    }

    public static <T extends Comparable<T>> void heapSort(T array[], int begin, int end) throws Exception{
        if(begin < 0 || begin >= end || end >= array.length)
            throw new Exception("Check your indices!");

        for(int i = ((end + begin) / 2) - 1; i >= begin; i--){
            toHeap(array, end, i, begin, end - 1);
        }

        for(int i = end - 1; i > begin; i--){
            T temp = array[i];
            array[i] = array[begin];
            array[begin] = temp;

            toHeap(array, i, begin, begin, end);
        }
    }

    private static <T extends Comparable<T>> void toHeap(T array[], int n, int i, int begin, int end){
        int largest = i;
        int left = 2 * (i - begin) + 1 + begin;
        int right = 2 * (i - begin) + 2 + begin;

        if(left < n && array[largest].compareTo(array[left]) < 0){
            largest = left;
        }

        if(right < n && array[largest].compareTo(array[right]) < 0){
            largest = right;
        }

        if(largest != i){
            T temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;

            toHeap(array, n, largest, begin, end);
        }
    }

    private static <T extends Comparable<T>> void toHeap(T array[], int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && array[largest].compareTo(array[left]) < 0){
            largest = left;
        }

        if(right < n && array[largest].compareTo(array[right]) < 0){
            largest = right;
        }

        if(largest != i){
            T temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;

            toHeap(array, n, largest);
        }
    }

    public static <T extends Comparable<? super T>> void heapSort(Vector<T> vector){
        for(int i = (vector.size() / 2) - 1; i >= 0; i--){
            toHeap(vector, vector.size(), i);
        }

        for(int i = vector.size() - 1; i > 0; i--){
            T temp = vector.get(i);
            vector.set(i, vector.get(0));
            vector.set(0, temp);

            toHeap(vector, i, 0);
        }
    }

    private static <T extends Comparable<? super T>> void toHeap(Vector<T> vector, int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && vector.get(largest).compareTo(vector.get(left)) < 0){
            largest = left;
        }

        if(right < n && vector.get(largest).compareTo(vector.get(right)) < 0){
            largest = right;
        }

        if(largest != i){
            T temp = vector.get(largest);
            vector.set(largest, vector.get(i));
            vector.set(i, temp);

            toHeap(vector, n, largest);
        }
    }
}
