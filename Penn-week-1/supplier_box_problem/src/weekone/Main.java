package weekone;

public class Main {
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given sizes of boxes");
        SortedBoxes sortedBoxes = new SortedBoxes();
        sortedBoxes.printArray(arr);

        sortedBoxes.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        sortedBoxes.printArray(arr);
    }
}
