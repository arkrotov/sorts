package sorts;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;

public abstract class Sort {

    int [] arr;
    long duration;

    public void sort (){
        LocalTime now = LocalTime.now();
        innerSort();
        duration = Duration.between(now,LocalTime.now()).toMillis();
    }
    public abstract void innerSort();

    public void getMessage () {
        System.out.println(this.getClass().getSimpleName() + " выполнил сортировку за " + duration + " миллисекунд.");
     //   System.out.println(" Результат сортировки: " + Arrays.toString(arr));
    }

    public void setArr(int[] arr) {
        this.arr = Arrays.copyOf(arr, arr.length);
    }

    void swap (int a, int b) {
        int local = arr[a];
        arr[a] = arr[b];
        arr[b] = local;
    }
}
