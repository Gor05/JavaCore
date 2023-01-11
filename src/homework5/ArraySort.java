package homework5;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};

        int count;
        do {
            count = 0;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    count++;

                }
            }
        }while (count > 0);
        for(int num : numbers){
            System.out.print(num + ",");
        }
    }
}
