package com.epam.javauniversity.hw5;

public final class IntArrayUtil {

    private IntArrayUtil() {
    }

    public static int[] filter(int[] array, Predicate predicate) {
        if (array == null || predicate == null) {
            return new int[]{};
        }
        int[] tempArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (predicate.selection(array[i])) {
                tempArray[count] = array[i];
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = tempArray[i];
        }
        return result;
    }

}
