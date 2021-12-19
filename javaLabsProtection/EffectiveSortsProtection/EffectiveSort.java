import java.util.Vector;

public class EffectiveSort{

    private static void swap(int array[], int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static <T extends Comparable<T>> void swap(T array[], int i, int j){
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static <T extends Comparable<? super T>> void swap(Vector<T> vector, int i, int j){
        T tmp = vector.get(i);
        vector.set(i, vector.get(j));
        vector.set(j, tmp);
    }

    public static void quickSort(int array[]) throws Exception {
        quickSort(array, 0, array.length - 1);
    }

    private static int partition(int array[], int begin, int end){
        int pivot = array[end];
        int i = begin - 1;

        for(int j = begin; j < end; j++){
            if(array[j] < pivot){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, (i + 1), end);
        return (i + 1);
    }

    public static void quickSort(int array[], int begin, int end) throws Exception{
        if(begin < 0 || end >= array.length)
            throw new Exception("Check your indices!");

        if(begin < end){
            int p = partition(array, begin, end);
            quickSort(array, begin, p - 1);
            quickSort(array, p + 1, end);
        }
    }

    private static <T extends Comparable<T>> int partition(T array[], int begin, int end){
        T pivot = array[end];
        int i = begin - 1;

        for(int j = begin; j < end; j++){
            if(array[j].compareTo(pivot) < 0){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, (i + 1), end);
        return (i + 1);
    }

    public static <T extends Comparable<T>> void quickSort(T array[]) throws Exception{
        quickSort(array, 0, array.length - 1);
    }

    public static <T extends Comparable<T>> void quickSort(T array[], int begin, int end) throws Exception{
        if(begin < 0 || end >= array.length)
            throw new Exception("Check your indices!");

        if(begin < end){
            int p = partition(array, begin, end);
            quickSort(array, begin, p - 1);
            quickSort(array, p + 1, end);
        }
    }

    private static <T extends Comparable<? super T>> int partition(Vector<T> vector, int begin, int end){
        T pivot = vector.get(end);
        int i = begin - 1;
        T tmp;

        for(int j = begin; j < end; j++){
            if(vector.get(j).compareTo(pivot) < 0){
                i++;
                swap(vector, i, j);
            }
        }
        swap(vector, (i + 1), end);
        return (i + 1);
    }

    public static <T extends Comparable<? super T>> void quickSort(Vector<T> vector){
        quickSort(vector, 0, vector.size() - 1);
    }

    private static <T extends Comparable<? super T>> void quickSort(Vector<T> vector, int begin, int end){
        if(begin < end){
            int p = partition(vector, begin, end);
            quickSort(vector, begin, p - 1);
            quickSort(vector, p + 1, end);
        }
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

        int left = 0, right = 0;
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

        Vector<T> leftPart = new Vector<>(leftSize);
        Vector<T> rightPart = new Vector<>(rightSize);

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

        Vector<T> leftPart = new Vector<>(leftSize);
        Vector<T> rightPart = new Vector<>(rightSize);

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
            swap(array, i, 0);
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

    private static void toHeap(int array[], int heapSize, int rootNodeIndex){
        int largest = rootNodeIndex;
        int left = 2 * rootNodeIndex + 1;
        int right = 2 * rootNodeIndex + 2;

        if(left < heapSize && array[largest] < array[left]){
            largest = left;
        }

        if(right < heapSize && array[largest] < array[right]){
            largest = right;
        }

        if(largest != rootNodeIndex){
            swap(array, largest, rootNodeIndex);
            toHeap(array, heapSize, largest);
        }
    }

    public static <T extends Comparable<T>> void heapSort(T array[]){
        for(int i = (array.length / 2) - 1; i >= 0; i--){
            toHeap(array, array.length, i);
        }

        for(int i = array.length - 1; i > 0; i--){
            swap(array, i, 0);
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
            swap(array, i, begin);
            toHeap(array, i, begin, begin, end);
        }
    }

    private static <T extends Comparable<T>> void toHeap(T array[], int heapSize, int rootNodeIndex, int begin, int end){
        int largest = rootNodeIndex;
        int left = 2 * (rootNodeIndex - begin) + 1 + begin;
        int right = 2 * (rootNodeIndex - begin) + 2 + begin;

        if(left < heapSize && array[largest].compareTo(array[left]) < 0){
            largest = left;
        }

        if(right < heapSize && array[largest].compareTo(array[right]) < 0){
            largest = right;
        }

        if(largest != rootNodeIndex){
            swap(array, largest, rootNodeIndex);
            toHeap(array, heapSize, largest, begin, end);
        }
    }

    private static <T extends Comparable<T>> void toHeap(T array[], int heapSize, int rootNodeIndex){
        int largest = rootNodeIndex;
        int left = 2 * rootNodeIndex + 1;
        int right = 2 * rootNodeIndex + 2;

        if(left < heapSize && array[largest].compareTo(array[left]) < 0){
            largest = left;
        }

        if(right < heapSize && array[largest].compareTo(array[right]) < 0){
            largest = right;
        }

        if(largest != rootNodeIndex){
            swap(array, largest, rootNodeIndex);
            toHeap(array, heapSize, largest);
        }
    }

    public static <T extends Comparable<? super T>> void heapSort(Vector<T> vector){
        for(int i = (vector.size() / 2) - 1; i >= 0; i--){
            toHeap(vector, vector.size(), i);
        }

        for(int i = vector.size() - 1; i > 0; i--){
            swap(vector, i, 0);
            toHeap(vector, i, 0);
        }
    }

    private static <T extends Comparable<? super T>> void toHeap(Vector<T> vector, int heapSize, int rootNodeIndex){
        int largest = rootNodeIndex;
        int left = 2 * rootNodeIndex + 1;
        int right = 2 * rootNodeIndex + 2;

        if(left < heapSize && vector.get(largest).compareTo(vector.get(left)) < 0){
            largest = left;
        }

        if(right < heapSize && vector.get(largest).compareTo(vector.get(right)) < 0){
            largest = right;
        }

        if(largest != rootNodeIndex){
            swap(vector, largest, rootNodeIndex);
            toHeap(vector, heapSize, largest);
        }
    }

    public static void getMaxSubsequence(int array[]){
        int currentMax = 1, max = 1, currentIndex = 0, index = 0;
        for (int i = 0, j = 1; j < array.length; i++, j++) {
            currentMax = 1;
            currentIndex = i;

            while ((j < array.length) && (array[i] == array[j])) {
                currentMax++;
                i++;
                j++;
            }
            if(currentMax > max) {
                max = currentMax;
                index = currentIndex;
            }
        }
        for(int i = index; i < index + max; i++)
            System.out.println("[" + i + "]: " + array[i]);
        System.out.println("Size of subsequence: " + max);
    }
}
