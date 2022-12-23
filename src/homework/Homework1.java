package homework;

public class Homework1 {
    public static void main(String[] args) {

        //ֆիգուռ 1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//----------------------------------------------------------------------------------------------------------------------
        // ֆիգուռ 2
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        //--------------------------------------------------------------------------------------------------------------
        // ֆիգուռ 3
        int i;
        for ( i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}