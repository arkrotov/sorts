package sorts;

public class HeapSortAlgorithm extends Sort{
    public void innerSort() {
        int N = arr.length;
        for (int k = N / 2; k > 0; k--) downHeap(arr, k, N);
        do {
            int T = arr[0];
            arr[0] = arr[N - 1];
            arr[N - 1] = T;
            N = N - 1;
            downHeap(arr, 1, N);
        } while (N > 1);
    }
    private void downHeap(int a[], int k, int N) {
        int T = a[k - 1];
        while (k <= N / 2) {
            int j = k + k;
            if ((j < N) && (a[j - 1] < a[j])) j++;
            if (T >= a[j - 1]) {
                break;
            } else {
                a[k - 1] = a[j - 1];
                k = j;
            }
        }
        a[k - 1] = T;
    }
}
