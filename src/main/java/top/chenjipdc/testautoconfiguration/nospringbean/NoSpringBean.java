package top.chenjipdc.testautoconfiguration.nospringbean;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-15 09:59
 */
public class NoSpringBean {

    private String name = "custom-bean";

    private boolean isSpringbean = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSpringbean() {
        return isSpringbean;
    }

    public void setSpringbean(boolean springbean) {
        isSpringbean = springbean;
    }

    @Override
    public String toString() {
        return "NoSpringBean{" +
                "name='" + name + '\'' +
                ", isSpringbean=" + isSpringbean +
                '}';
    }
}
