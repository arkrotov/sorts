package sorts;

public class ShellSort extends Sort{

    @Override
    public void innerSort() {
        int temp, j;
        int q = arr.length;
        do {
            q = q/2;
            for (int i = 0; i < arr.length; i += q) {
                temp = arr[i];
                j = i;
                while (j > 0 && arr[j - q] > temp) {
                    arr[j] = arr[j - q];
                    j-=q;
                }
                arr[j] = temp;
            }
        } while (q > 1);
    }
}


