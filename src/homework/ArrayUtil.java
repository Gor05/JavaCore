package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int sum = 0;
        System.out.print("բոլոր էլեմենտները։ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println();
        System.out.print("զույգ թվեր։ ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.print("կենտ թվեր։ ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("գումար։ " + sum);
        //աոաջին անդամ
        System.out.println("առաջին անդամ։ " + array[0]);
        //վերջին անդամ
        System.out.println("վերջին անդամ։ " + (array.length - 1));

        int startIndex = 0;
        int lastIndex = array.length - 1;
        int midIndex = startIndex + (lastIndex - startIndex) / 2;
        System.out.println("The mid index is " + midIndex + " and the element at mid is " + array[midIndex]);
        //min
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("մինիմում։ " + min);

        //max
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("մակսիմում։ " + max);


    }
}
