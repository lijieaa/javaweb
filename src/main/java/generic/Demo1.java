package generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/19.
 */
public class Demo1 {

   @Test
    public void test1() {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("aa0");
        String s = strings.get(0);
        System.out.println(s);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void test2() throws Exception {

        HashMap<String, String> stringStringHashMap = new HashMap<String, String>();
        stringStringHashMap.put("a","aaaa");
        stringStringHashMap.put("b", "bbbb");
        stringStringHashMap.put("c", "cccc");

        for (Map.Entry<String, String> entry : stringStringHashMap.entrySet()) {
            System.out.println(entry.getKey()+"===>"+entry.getValue());
        }

    }

    @Test
    public void test3() throws Exception {

         Integer arr[] = {1,2,3};

        swap(arr, 0, 1);

        for (Integer integer : arr) {
            System.out.println(integer);
        }


    }

    public <T> void swap(T arr[],int p1,int p2){
        T tem = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = tem;
    }
}
