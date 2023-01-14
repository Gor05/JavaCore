package homework6;

public class ArrayUtil {
    void allElements() {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int sum = 0;
        double total = 0;
        System.out.print("բոլոր էլեմենտները։ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            sum += array[i];
        }
    }

    void evenElements() {
        System.out.print("զույգ թվեր։ ");
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    void oddElements() {
        System.out.print("կենտ թվեր։ ");
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
    }

    void average() {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        double average = total / array.length;
        System.out.print("միջին թվաբանական։ " + average);
    }

    void midIndex() {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int startIndex = 0;
        int lastIndex = array.length - 1;
        int midIndex = startIndex + (lastIndex - startIndex) / 2;
        System.out.println("The mid index is " + midIndex + " and the element at mid is " + array[midIndex]);
    }

    void minimum() {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("մինիմում։ " + min);
    }

    void maximum() {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("մակսիմում։ " + max);

    }

    public static void main(String[] args) {


    }
}
