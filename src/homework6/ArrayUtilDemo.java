package homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        ArrayUtil au = new ArrayUtil();
        au.allElements(array);
        System.out.println();
        au.average(array);
        System.out.println();
        au.evenElements(array);
        System.out.println();
        au.oddElements(array);
        System.out.println();
        au.midIndex(array);
        au.minimum(array);
        au.maximum(array);
        System.out.println("առաջին անդամ։ " + array[0]);
        System.out.println("վերջին անդամ։ " + (array.length - 1));
    }
}
