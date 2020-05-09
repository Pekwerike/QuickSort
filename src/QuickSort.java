public class QuickSort<Item> implements Comparable<Item> {
    @Override
    public int compareTo(Item item) {
        return this.compareTo(item);
    }

    private static boolean less(Comparable a, Comparable b){
        return b.compareTo(a) > 0;
    }

    private static void exchange(Comparable[] inputArray, int i, int j){
        Comparable swap = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = swap;
    }

    private static void sort(Comparable[] inputArray, int low, int high){
        if(high <= low) return;
        int j = partition(inputArray, low, high);
        sort(inputArray,low, j-1 );
        sort(inputArray, j+1, high);
    }

    public void sort(Comparable[] inputArray){
        int low = 0;
        int high = inputArray.length -1;
        sort(inputArray, low, high);
    }

    private static int partition(Comparable[] inputArray, int low, int high){
        int i = low + 1;
        int j = high;

        while(true){
            while(less(inputArray[i], inputArray[low])){
                if(i == high) break;
                i = i + 1;
            }

            while(less(inputArray[low], inputArray[j])){
                if(j == low) break;
                j = j - 1;
            }

            if(j <= i) break;
            exchange(inputArray, i, j);
        }
        exchange(inputArray, low, j);
        return j;
    }
}
