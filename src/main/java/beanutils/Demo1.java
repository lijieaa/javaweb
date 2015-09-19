package beanutils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2015/9/19.
 */
public class Demo1 {

    Person person;

    @Before
    public void setUp() throws Exception {

        person = new Person();

    }

    @Test
    public void test1() throws InvocationTargetException, IllegalAccessException {

        BeanUtils.setProperty(person, "name", "xxxx");
        //BeanUtils.setProperty(person,"birthday","1990-12-02");

        //ConvertUtils.register(new DateLocaleConverter(),Date.class);

        System.out.println(person.getName());
        //System.out.println(person.getBirthday().toLocaleString());
    }
}
