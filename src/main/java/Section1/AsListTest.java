package Section1.collectionTest;

import java.util.ArrayList;
import java.util.Arrays;

public class AsListTest<T> {
    public static void main(String[] args) {


        ArrayList list = new ArrayList();
        list.add(12);
        list.add("weiouhf");
        list.add(new ArrayList());

        String str = new String("fljeifjw");
        System.out.println(str.hashCode());

        String[] arr = new String[4];
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(arr));
    }



}
