public class Main {
    public static void main(String[] args) {
        int a[] = {109, 200, 7, 28, 49, 99, 121, 4873, 892, 938, 23, 34, 4589,8273};
        int val = 121;
        int n = a.length;
        LinearSearch linearSearch = new LinearSearch();
        BinarySearch binarySearch = new BinarySearch();
        int binarySol = binarySearch.bSearch(a, 0, n-1, val);
        int res = linearSearch.lSearch(a, n, val);
        System.out.println();
        System.out.print("The elements of the array are - ");
        for (int i = 0; i < n; i++)
            System.out.print(" " + a[i]);
        System.out.println();
        System.out.println("Element to be searched is - " + val);
        if (res == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at " + res +" position of array using Linear Search");
        System.out.println("Element is present at " + binarySol +" position of array using Binary Search");
    }
}
