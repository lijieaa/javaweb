import org.junit.Test;

import java.util.ArrayList;

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
}
