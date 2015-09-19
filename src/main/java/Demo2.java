import org.junit.Test;

public class Demo2 {

    public void print(Grade g){
        System.out.println(g.getValue());
    }

    @Test
    public void test1() throws Exception {
        this.print(Grade.A);
    }
}

enum Grade{

    A("100-90"),B("90-80"),C("80-70"),D("70-60"),E("60-0");

    private Grade(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    private String value;
}
