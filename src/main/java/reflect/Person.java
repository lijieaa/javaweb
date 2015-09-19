package reflect;

import java.util.List;

/**
 * Created by Administrator on 2015/9/19.
 */
public class Person {

    public String name = "lijie";

    public Person() {
        System.out.println("person");
    }

    public Person(String name){
        System.out.println("person name");
    }

    public Person(String name,int age){
        System.out.println("person name age");
    }

    private Person(List list){
        System.out.println("person list");
    }
}
