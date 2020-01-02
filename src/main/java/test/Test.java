package test;

import com.google.inject.internal.cglib.core.$MethodWrapper;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("aaaa");
        arrayList.add(100);

        for(int i = 0; i< arrayList.size();i++){
            String item = (String)arrayList.get(i);
            System.out.println(item);
//            Log.d("泛型测试","item = " + item);
        }

    }
}


