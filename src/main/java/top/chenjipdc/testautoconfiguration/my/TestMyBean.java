package top.chenjipdc.testautoconfiguration.my;

import top.chenjipdc.logger.TestLogger;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-15 11:38
 */
public class TestMyBean {

    private String desc = "测试bean使用的描述";

    public TestMyBean() {
        TestLogger.log("TestMyBean 构造方法 => " + this);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "TestMyBean{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
