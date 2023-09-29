package HWFive.TasksThree;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayUtil {
    int min(int[] array) {
        return Collections.min(Arrays.stream(array).boxed().collect(Collectors.toList()));
    }

    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = {1, -5, 700, -1, -300};
        System.out.println(arrayUtil.min(arr));
        System.out.println(arrayUtil.max(arr));
    }
}
