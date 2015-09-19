import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2015/9/19.
 */
public class Demo1 {

    public static void main(String[] args) {
    }

    @Test
    public void test1() {
        int arr[] = {1,2,3};

        for (int i : arr) System.out.println(i);
    }

    @Test
    public void test2() throws Exception {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(4);
        integers.add(5);
        integers.add(6);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    @Test
    public void test3() throws Exception {
        HashMap<String, String> stringStringHashMap = new HashMap<String, String>();
        stringStringHashMap.put("1","a");
        stringStringHashMap.put("2","b");
        stringStringHashMap.put("3", "c");

        Set<String> strings = stringStringHashMap.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = stringStringHashMap.get(key);
            System.out.println(key+"=============>"+value);
        }
    }
}
