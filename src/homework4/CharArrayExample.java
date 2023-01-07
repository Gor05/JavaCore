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
        System.out.print("միջին անդամ "+chars2[chars2.length/2-1]);
        System.out.println();
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };

        for (int i = 0; i < chars3.length; i++) {
            System.out.print(chars3[i] + " ");
        }
        System.out.println();
            if (chars3[chars3.length-2] == 'l' && chars3[chars3.length-1] == 'y') {
                System.out.print(" " + true);
            }else System.out.println(false);


        System.out.println();
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        for (int i = 0; i < text.length; i++) {
            if (text[0] == ' ') {
                System.out.print(text[i]);
            }
        }
        System.out.print("առանց պոաբելների ");
    }
}


