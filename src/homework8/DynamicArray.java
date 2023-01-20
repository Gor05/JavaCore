package homework8;

import java.util.Arrays;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {
        size++;
       if (size == array.length){
          extend();
       }
       array[size - 1] = value;
    }
    private void extend() {
        int [] Array = new int [array.length + 10];
        for (int i = 0; i < array.length; i++) {
            Array[i] = array[i];
        }
        array = Array;

        }
    public int getByIndex(int index) {
       if(index < size || index >= 0) {
           return array[index];
    }else {
           return -1;
       }
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
