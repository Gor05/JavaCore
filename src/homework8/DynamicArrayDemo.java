package homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
     DynamicArray da = new DynamicArray();
     da.add(5);
     da.add(5);
     da.add(0);
     da.add(43);
     da.add(21);
     da.add(12);
     da.print();
     System.out.println(da.getByIndex(5));
    }
}
