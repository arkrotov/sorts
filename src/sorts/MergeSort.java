package sorts;

public class MergeSort extends Sort {

    private int[] helpArr;

    @Override
    public void innerSort() {
        helpArr = new int[arr.length];
        mergeSort(0,arr.length-1);
    }

    private void mergeSort(int low, int high) {
        if (low < high) {

            int middle = (low + high) / 2;

            mergeSort(low, middle);
            mergeSort(middle + 1, high);

            merge(low, middle, high);
        }
    }

    private void merge (int low, int middle, int high) {

        for (int i = low; i <= high; i++) {
            helpArr[i] = arr[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
            if (helpArr[i] <= helpArr[j]) {
                arr[k] = helpArr[i];
                i++;
            } else {
                arr[k] = helpArr[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            arr[k] = helpArr[i];
            k++;
            i++;
        }

    }


}

