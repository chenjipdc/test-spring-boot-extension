package top.chenjipdc.testspring.test;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-04-22 17:51
 */

@TestAnno
public class Test {

    private String name;

    public Test(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
