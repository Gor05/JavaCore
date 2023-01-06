package homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        int count = 0;
        char c = 'o';
        System.out.println();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println();
        System.out.println("c-երի քանակը " + count);
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        double total = 0;
        for (int i = 0; i < chars2.length; i++) {
            total = total + chars2[i];
        }
        double average = total / chars2.length;
        int startIndex = 0;
        int lastIndex = chars2.length - 1;
        int midIndex = startIndex + (lastIndex - startIndex) / 2;
        System.out.println();
        System.out.println("The mid index is " + midIndex + " and the element at mid is " + chars2[midIndex]);

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };

        for (int i = 0; i < chars3.length; i++) {
            System.out.print(chars3[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < chars3.length; i++) {
            if (chars3[i] == 'l') {
                System.out.print(" " + true);
            }
            if (chars3[i] == 'y') {
                System.out.print(" " + true);
            } else System.out.print(" " + false);
        }
        System.out.println();
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        for (int i = 0; i < text.length; i++) {
            if (text[0] == ' ') {
                System.out.print(text[i]);
            }
        }

    }
}


