package chapter2;

public class Example3 {

    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.println("За" + days);
        System.out.println("дней свет пройдет около");
        System.out.println(distance + "миль");


        //--------------------------------------------------------------------------------------------------------------

        double pi, r, a;
        r = 10.8;
        pi = 3.1416;
        a = pi * r * r;
        System.out.println("Площадь круга равна" + a);


        //--------------------------------------------------------------------------------------------------------------

        char ch1, ch2;
        ch1 = 88;
        ch2 = 'Y';
        System.out.println("ch1 и  ch2");
        System.out.println(ch1 + " " + ch2);


        //--------------------------------------------------------------------------------------------------------------


        char chl;
        chl = 'Х';
        System.out.println("chl содержит " + chl);
        chl++;
        System.out.println("chl теперь содержит " + chl);


        //--------------------------------------------------------------------------------------------------------------

        double а = 3.0, b = 4.0;

        double с = Math.sqrt(a * а + b * b);
        System.out.println("Гипoтeнyзa равна " +с);

        //--------------------------------------------------------------------------------------------------------------

     int x;
     for (x = 0;x < 3;x++){
         int y = -1;
         System.out.println("y ровно: " + y);
         y = 100;
         System.out.println("y тепер ровно :" + y);

     }
    }
}
