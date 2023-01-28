package homework8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {
        size++;
        if (size == array.length) {
            extend();
        }
        array[size - 1] = value;
    }

    private void extend() {
        int[] Array = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            Array[i] = array[i];
        }
        array = Array;

    }

    public int getByIndex(int index) {
        if (index < size || index >= 0) {
            return array[index];
        } else {
            return -1;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

    //ջնջել մասիվի index-երորդ էլեմենտը
//եթե չկա նման ինդեքսով էլեմենտ, տպել, որ չկա նման էլեմենտ
    public void deleteByIndex(int index) {
        if (index < size || index >= 0){
            int[] newArr = new int[array.length - 1];
            for (int i = 0, k = 0; i < array.length ; i++) {
                if (i == index){
                    continue;
                }
                newArr[k++] = array[i];
            }
            array = newArr;
            size --;
        }else {
            System.out.println("չկա նման ելեմենտ");
        }
    }


    //տրված value-ն դնելու ենք տրված index-ով էլեմենտի տեղը։
//Հին արժեքը կկորի
//եթե նման ինդեքսով էլեմենտ չկա, գրում ենք որ չկա։
    public void set(int index, int value) {
        for (int i = 0; i < array.length; i++) {
            if (i == index || array[i] == value) {
                index = value;
            } else {
                System.out.println("նման ինդեքսով ելեմենտ չկա");
            }
        }
    }

    //ավելացնել տրված value-ն տրված ինդեքսում, իսկ էղած էլեմենտները մի հատ աջ տանել։
//Եթե չկա նման ինդեքս, տպել որ չկա
    public void add(int index, int value) {

    }

    //Վերադարձնել true եթե տրված value-ն կա մեր մասիվի մեջ, եթե ոչ false
    public boolean exists(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            } else {

            }


        }
        return false;
    }

    //Վերադարձնել տրված value-ի ինդեքսը, եթե շատ կա տվյալ թվից, վերադարձնել առաջին ինդեքսը։
//եթե չկա, -1
    public int getIndexByValue(int value) {
        return 0;
    }
}
