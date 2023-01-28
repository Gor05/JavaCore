package homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        int [] newArr = new int[array.length - 1];
     DynamicArray da = new DynamicArray();
     da.add(5);
     da.add(7);
     da.add(1);
     da.add(43);
     da.add(21);
     da.add(12);
     da.add(2);
     da.deleteByIndex(0);
     da.exists(5);
     da.set(4,2);
     da.print();
     System.out.println(da.getByIndex(4));
    }
}
