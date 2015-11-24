package com.epam.javauniversity.hw5;

import java.util.Arrays;

public final class IntArrayUtil {

    private IntArrayUtil() {
    }

    public static int[] filter(int[] array, Predicate predicate) {
        if (array == null) {
            return new int[]{};
        }
        if (predicate == null) {
            return new int[]{};
        }
        int[] temp = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (predicate.apply(array[i])) {
                temp[count] = array[i];
                count++;
            }
        }
        return Arrays.copyOf(temp, count);
    }

}
