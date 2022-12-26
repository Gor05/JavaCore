package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        // Բոլոր ելեմենտները
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i] + " ");
            // զույգ թվեր
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
            //կենտ թվեր
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
            //գումար
            sum += array[i];
            System.out.println(sum);
        }
        //աոաջին անդամ
        System.out.println(array[0]);
        //վերջին անդամ
        System.out.println(array.length - 1);

        //մեյտեղի էլեմնտ
        int startIndex = 0;
        int lastIndex = array.length - 1;
        int midIndex = startIndex + (lastIndex - startIndex) / 2;
        System.out.println("The mid index is" + midIndex + "and the element at mid is" + array[midIndex]);
        //min
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);

        //max
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);


        }
    }
