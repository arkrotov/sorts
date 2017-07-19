package sorts;

public class BubleSort extends Sort{
    @Override
    public void innerSort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int smth = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = smth;
                }
            }
        }
    }
}
