public class LinearSearch {
    public int lSearch(int a[], int n, int val) {

        for (int i = 0; i < n; i++)
        {
            if (a[i] == val)
                return i+1;
        }
        return -1;
    }
}
