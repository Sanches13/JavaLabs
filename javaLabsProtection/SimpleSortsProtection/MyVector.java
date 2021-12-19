public class MyVector<T>{
    int maxSize;
    int currentSize;
    Object[] vector;

    public MyVector(int size){
        maxSize = 2 * size + 10;
        currentSize = 0;
        vector = new Object[maxSize];
    }

    public MyVector(MyVector<T> copyOfVector){
        maxSize = copyOfVector.maxSize;
        currentSize = copyOfVector.currentSize;
        vector = new Object[maxSize];
        for(int i = 0; i < currentSize; i++){
            vector[i] = copyOfVector.vector[i];
        }
    }

    public void insertAtEnd(T newData){
        if(currentSize >= maxSize){
            resizingOfVector();
        }
        vector[currentSize] = newData;
        currentSize++;
    }

    public void deleteEndElem() throws Exception{
        if(currentSize == 0)
            throw new Exception("This vector is empty!");

        vector[currentSize - 1] = null;
        currentSize--;
    }

    public void deleteByIndex(int index) throws Exception{
        if(index < 0 || index >= currentSize)
            throw new Exception("Error index. Your index: " + index + "; Current size: " + currentSize);

        for(int i = index; i < currentSize - 1; i++){
            vector[i] = vector[i + 1];
        }
        vector[currentSize - 1] = null;
        currentSize--;
    }

    public void insertByIndex(int index, T newData) throws Exception{
        if(index < 0 || index > currentSize)
            throw new Exception("Error index. Your index: " + index + "; Current size: " + currentSize);

        if(currentSize >= maxSize){
            resizingOfVector();
        }

        for(int i = currentSize; i > index; i--){
            vector[i] = vector[i - 1];
        }

        vector[index] = newData;
        currentSize++;
    }

    private void resizingOfVector(){
        maxSize = maxSize == 0 ? 16 : (3 * maxSize) / 2 + 1;
        Object[] newVector = new Object[maxSize];

        for(int i = 0; i < currentSize; i++){
            newVector[i] = vector[i];
        }

        vector = newVector;
    }

    public void deleteAll(){
        vector = new Object[0];
        currentSize = 0;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize(){
        return currentSize;
    }

    //--------------
    public void printVector(){
        for(int i = 0; i < currentSize; i++)
            System.out.print(vector[i] + " ");
        System.out.println();
    }
    //--------------

    @SuppressWarnings("unchecked")
    public T get(int number){
        return (T) vector[number];
    }

    public void set(int number, T element){
        vector[number] = element;
    }
}