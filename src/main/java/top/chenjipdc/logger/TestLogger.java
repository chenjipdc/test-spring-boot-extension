package top.chenjipdc.logger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-15 17:39
 *
 * 搞事情的logger
 */
public class TestLogger {

    private static AtomicInteger atomicInteger = new AtomicInteger(1);

    public static void log(String msg){
        System.out.println("\033[33;0m" + atomicInteger.getAndIncrement() + " ----> " + msg + "\033[0m");
    }
}
