package chapter2;

public class Example2 {


    public static void main(String[] args) {

        int num = 100;
        System.out.println("это переменная num");

        num = num * 2;
        System.out.println(num);
//----------------------------------------------------------------------------------------------------------------------

        int x = 10;
        int y = 20;
        if (x < y) {
            System.out.println("x менше y");
        }

        x = x * 2;

        if (x == y) {
            System.out.println("x тепер ровно y");
        }

        x = x * 2;
        if (x > y) {
            System.out.println("x тепер больше y");

        }
        //--------------------------------------------------------------------------------------------------------------
        for(x = 0;x < 10;x++){
            System.out.println("x большая");
        }
    }
}
