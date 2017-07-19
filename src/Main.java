import sorts.*;
import sorts.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by me on 19.07.17.
 */
public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        List<sorts.Sort> list = new ArrayList<>();

        list.add(new HeapSortAlgorithm());
        list.add(new MergeSort());
        list.add(new QSort());
        list.add(new ShellSort());
        list.add(new InsertSort());
        list.add(new SelectionSort());
        list.add(new BubleSort());

        int i = 100000;
        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            arr[j] = random.nextInt(100000);
        }

        //System.out.println("Исходный массив: " + Arrays.toString(arr));
        for (Sort sort : list) {
            sort.setArr(arr);
            sort.sort();
            sort.getMessage();
        }
    }
}


