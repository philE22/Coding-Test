package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListTest<T> {
    public static void main(String[] args) {


        ArrayList list = new ArrayList();
        list.add(12);
        list.add("weiouhf");
        list.add(new ArrayList());

        String str = new String("fljeifjw");
        System.out.println(str.hashCode());
    }



}
