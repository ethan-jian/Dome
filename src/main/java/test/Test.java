package test;

import java.util.Arrays;
import java.util.List;

;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);
        Number[] arry = list.toArray(new Number[0]);
        for (Number n: arry){
            System.out.println(n);
        }
        System.out.println(arry.length);
        System.out.println(list);
        System.out.println(arry);
        Integer[] array = { 1, 2, 3 };
        System.out.println(Arrays.toString(array));
        }

    }



