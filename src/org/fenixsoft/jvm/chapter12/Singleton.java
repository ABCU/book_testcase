package org.fenixsoft.jvm.chapter12;

/**
 * DCL测试
 * -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly
 * @author zzm
 */
public class Singleton {
    private static Singleton instance;
//    private volatile static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
