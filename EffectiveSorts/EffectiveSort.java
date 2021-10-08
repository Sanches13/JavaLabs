import java.util.List;
import java.util.ArrayList;

class EffectiveSort{

    public static void quickSortSequence(int array[], int begin, int end) throws Exception{
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        if(begin < 0 || begin >= end)
            throw new Exception("Error begin index!");

        if(end < 0 || end >= array.length)
            throw new Exception("Error end index!");


        int middle = begin + (end - begin) / 2;
        int left = begin;
        int right = end;
        while(left <= right){
            while(array[left] < array[middle])
                left++;
            while(array[right] > array[middle])
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
            quickSortSequence(array, begin, right);
        if(left < end)
            quickSortSequence(array, left, end);
    }

    public static void quickSortInt(int array[]) throws Exception {
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        quickSortSequence(array, 0, array.length - 1);
    }

    public static <T extends Comparable<T>> void quickSortAll(T array[]) throws Exception{
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        quickSortSequenceAll(array, 0, (array.length - 1));
    }

    public static <T extends Comparable<T>> void quickSortSequenceAll(T array[], int begin, int end) throws Exception{
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        if(begin < 0 || begin >= end)
            throw new Exception("Error begin index!");

        if(end < 0 || end >= array.length)
            throw new Exception("Error end index!");

        int middle = begin + (end - begin) / 2;
        int left = begin;
        int right = end;
        while(left <= right){
            while(array[left].compareTo(array[middle]) < 0)
                left++;
            while(array[right].compareTo(array[middle]) > 0)
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
            quickSortSequenceAll(array, begin, right);
        if(left < end)
            quickSortSequenceAll(array, left, end);
    }

    public static void mergeSortInt(int array[]) throws Exception{
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        mergeSortSequence(array, 0, array.length - 1);
    }

    public static void mergeSortSequence(int array[], int begin, int end) throws Exception{
        if(begin >= end)
            return;
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        if(begin < 0)
            throw new Exception("Error begin index!");

        if(end < 0 || end >= array.length)
            throw new Exception("Error end index!");

        int middle = begin + (end - begin) / 2;
        mergeSortSequence(array, begin, middle);
        mergeSortSequence(array, middle + 1, end);
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

    public static <T extends Comparable<T>> void mergeSortAll(T array[]) throws Exception{
        if(array.length == 0)
            throw new Exception("Your array is empty!");

        mergeSortSequenceAll(array, 0, array.length - 1);
    }

    public static <T extends Comparable<T>> void mergeSortSequenceAll(T array[], int begin, int end) throws Exception{
        if(begin >= end)
            return;

        if(array.length == 0)
            throw new Exception("Your array is empty!");

        if(begin < 0)
            throw new Exception("Error begin index!");

        if(end < 0 || end >= array.length)
            throw new Exception("Error end index!");

        int middle = begin + (end - begin) / 2;
        mergeSortSequenceAll(array, begin, middle);
        mergeSortSequenceAll(array, middle + 1, end);
        mergeAll(array, begin, middle, end);
    }

    private static <T extends Comparable<T>> void mergeAll(T array[], int begin, int middle, int end){
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

    public static void heapSortInt(int array[]){
        for(int i = (array.length - 1) / 2; i >= 0; i--){
            toHeap(array, array.length - 1, i);
        }

        for(int i = array.length - 1; i >= 0; i--){
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            toHeap(array, i, 0);
        }
    }

    public static void heapSortSequence(int array[], int begin, int end){
        for(int i = (begin + end) / 2 - 1; i >= begin; i--){
            toHeapSequence(array, end + 1, i, begin, end);
        }

        for(int i = end; i >= begin; i--){
            int temp = array[i];
            array[i] = array[begin];
            array[begin] = temp;

            toHeapSequence(array, i, begin, begin, end);
        }
    }

    private static void toHeapSequence(int array[], int n, int i, int begin, int end){
        int largest = i;
        int l = 2 * (i - begin) + 1 + begin;
        int r = 2 * (i - begin) + 2 + begin;

        if(l < n && array[largest] < array[l]){
            largest = l;
        }

        if(r < n && array[largest] < array[r]){
            largest = r;
        }

        if(largest != i){
            int temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;

            toHeapSequence(array, n, largest, begin, end);
        }
    }

    private static void toHeap(int array[], int n, int i){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if(l < n && array[largest] < array[l]){
            largest = l;
        }

        if(r < n && array[largest] < array[r]){
            largest = r;
        }

        if(largest != i){
            int temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;

            toHeap(array, n, largest);
        }
    }

    public static <T extends Comparable<T>> void heapSortAll(T array[]){
        for(int i = (array.length - 1) / 2; i >= 0; i--){
            toHeapAll(array, array.length - 1, i);
        }

        for(int i = array.length - 1; i >= 0; i--){
            T temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            toHeapAll(array, i, 0);
        }
    }

    private static <T extends Comparable<T>> void toHeapAll(T array[], int n, int i){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if(l < n && array[largest].compareTo(array[l]) < 0){
            largest = l;
        }

        if(r < n && array[largest].compareTo(array[r]) < 0){
            largest = r;
        }

        if(largest != i){
            T temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;

            toHeapAll(array, n, largest);
        }
    }
}
