package reflect;

import java.io.InputStream;
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


    public void aa1(){
        System.out.println("aa1");
    }

    public void aa1(String name,int age){
        System.out.println(name+":"+age);
    }


    public Class[] aa1(String name,int[] age){
        return new Class[]{String.class};
    }

    private void aa1(InputStream in){
        System.out.println(in);
    }

    public static void aa1(int num){
        System.out.println(num);
    }

    public static void main(String[] args) {
        System.out.println("start main");
    }
}
