public class MainClass {
    public static void main(String[] args){
        QuickSort<String> quickSort = new QuickSort<>();
        String[] names = {"Prosper", "Ekwerike", "Chiamaka", "Olamilesi", "Israel", "Tunji", "Olayemi", "Osinbanjo"};
        quickSort.sort(names);

        for(String element : names){
            System.out.println(element);
        }
    }
}
