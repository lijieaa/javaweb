package reflect;

import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * Created by Administrator on 2015/9/19.
 * 反射方法
 */
public class Demo3 {
    Class<?> clazz;
    Person p;
    @Before
    public void setUp() throws Exception {

        clazz = Class.forName("reflect.Person");
        p = new Person();
    }

    @Test
    public void test1() throws Exception {

        Method aa1 = clazz.getMethod("aa1", null);
        aa1.invoke(p,null);

    }

    @Test
    public void test2() throws Exception {

        Method aa1 = clazz.getMethod("aa1", String.class, int.class);
        aa1.invoke(p,"htt",188);



    }

    @Test
    public void test3() throws Exception {

        Method aa1 = clazz.getMethod("aa1", String.class, int[].class);
        Class[] cs = (Class[])aa1.invoke(p, "htt", new int[]{1, 2, 3});
        System.out.println(cs[0]);
    }


    @Test
    public void test4() throws Exception {
        Method aa1 = clazz.getDeclaredMethod("aa1", InputStream.class);
        aa1.setAccessible(true);
        aa1.invoke(p, new FileInputStream("F:\\hadoop\\高级班课程\\高级班全套视频\\高级班-2-HBase基础知识\\hbase.ppt"));
    }

    @Test
    public void test5() throws Exception {
        Method aa1 = clazz.getMethod("aa1", int.class);
        aa1.invoke(null,6465);
    }

    @Test
    public void test6() throws Exception {

        Method method = clazz.getMethod("main", String[].class);
       // method.invoke(null,(Object)new String[]{"aa","bb"});
        method.invoke(null,new Object[]{new String[]{"aa","bb"}});

    }
}
