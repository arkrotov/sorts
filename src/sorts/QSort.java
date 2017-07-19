package sorts;

public class QSort extends Sort {

    public QSort() {}
    @Override
    public void innerSort() {
        qSort(0,arr.length-1);
    }
    private void qSort(int low, int high) {
        int a = low;
        int b = high;
        int pivot = arr[b];
        while (a <= b) {
            while (arr[a] < pivot) {
                a++;
            }
            while (arr[b] > pivot) {
                b--;
            }
            if (a <= b) {
                swap(a++,b--);
            }
        }
        if (b > low) {
            qSort(low, b);
        }
        if (a < high) {
            qSort(a, high);
        }
    }
}
