package pojo;

import java.util.List;

public class MyTest{
    private List<String> name;

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public MyTest(List<String> name) {

        this.name = name;
    }
}
