package sorts;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;

/**
 * Created by me on 19.07.17.
 */


public class InsertSort extends Sort {
    public InsertSort() {}
    @Override
    public void innerSort() {
        int temp, j;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
