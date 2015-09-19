import org.junit.Test;

public class Demo2 {

    public void print(Grade g){
        System.out.println(g.getValue()+"==>"+g.localeValue());
    }

    @Test
    public void test1() throws Exception {
        this.print(Grade.A);
    }

    /**
     * 测试enum的方法
     * @throws Exception
     */
    @Test
    public void test2() throws Exception {
        System.out.println(Grade.A.name());
        System.out.println(Grade.A.ordinal());

        String str = "B";

        Grade grade = Grade.valueOf(str);
        System.out.println(grade);

        Grade[] values = Grade.values();
        for (Grade value : values) {
            System.out.println(value);
        }
    }
}

enum Grade{

    A("100-90"){
        public  String localeValue(){
            return "优";
        };
    },B("90-80"){
        public  String localeValue(){
            return "良";
        };
    },C("80-70"){
        public  String localeValue(){
            return "中";
        };
    },D("70-60"){
        public  String localeValue(){
            return "差";
        };
    },E("60-0"){
        public  String localeValue(){
            return "不及格";
        };
    };

    private Grade(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    private String value;

    public abstract String localeValue();
}
