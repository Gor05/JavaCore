package example;

public class Example {
    void test(int a){
        System.out.println("a:" + a );
    }
    void test(int a,int b){
        System.out.println(a + " " + b);
    }
    double test(double a){
        System.out.println(a);
        return a * a;
    }
}
