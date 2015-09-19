import org.junit.Test;

import java.util.*;

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
        //hashmap无序，linkedhashmap有序
        HashMap<String, String> stringStringHashMap = new LinkedHashMap<String, String>();
        stringStringHashMap.put("1","a");
        stringStringHashMap.put("2", "b");
        stringStringHashMap.put("3", "c");

        Set<String> strings = stringStringHashMap.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = stringStringHashMap.get(key);
            System.out.println(key+"=============>"+value);
        }
    }

    @Test
    public void test4() throws Exception {

        LinkedHashMap<String, String> stringStringLinkedHashMap = new LinkedHashMap<String, String>();
        stringStringLinkedHashMap.put("1","a");
        stringStringLinkedHashMap.put("2","b");
        stringStringLinkedHashMap.put("3","c");
        stringStringLinkedHashMap.put("4", "d");

        Set<Map.Entry<String, String>> entries = stringStringLinkedHashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key+"====>"+value);

        }
    }

    @Test
    public void test5() throws Exception {
        LinkedHashMap<String, String> stringStringLinkedHashMap = new LinkedHashMap<String, String>();
        stringStringLinkedHashMap.put("1","a");
        stringStringLinkedHashMap.put("2","b");
        stringStringLinkedHashMap.put("3","c");
        stringStringLinkedHashMap.put("4", "d");


        Set<String> strings = stringStringLinkedHashMap.keySet();
        for (String key : strings) {
            String value = stringStringLinkedHashMap.get(key);
            System.out.println(key+"====>"+value);
        }

    }

    @Test
    public void test6() throws Exception {
        LinkedHashMap<String, String> stringStringLinkedHashMap = new LinkedHashMap<String, String>();
        stringStringLinkedHashMap.put("1","a");
        stringStringLinkedHashMap.put("2","b");
        stringStringLinkedHashMap.put("3","c");
        stringStringLinkedHashMap.put("4", "d");

        for (Map.Entry<String, String> stringStringEntry : stringStringLinkedHashMap.entrySet()) {
            String key = stringStringEntry.getKey();
            String value = stringStringEntry.getValue();
            System.out.println(key+"===========>"+value);
        }

    }
}
