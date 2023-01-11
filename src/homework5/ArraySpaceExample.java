package homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        for (int i = 0; i < spaceArray.length -1; i++) {
//            System.out.print(spaceArray[i]);

            if (spaceArray[0] == ' ' && spaceArray[spaceArray.length - 1] == ' ') {
                System.out.print(spaceArray[i]);
            }
        }
    }
}
