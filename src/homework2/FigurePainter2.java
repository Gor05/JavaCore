package homework2;

public class FigurePainter2 {
    public static void main(String[] args) {
        //figure 1
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
