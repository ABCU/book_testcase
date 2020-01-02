package org.fenixsoft.jvm.chapter6;

public class TestExceptionClass {
    private int i;
    private static int j = 1;
    private final int m = 2;
    private final static int n = 3;

    public void method() {
        return;
    }

    public static int increase(int v) {
        int result = 0;
        try {
            result = j + v;
        } catch (Exception e) {
            e.fillInStackTrace();
        } finally {
            System.out.println("finally");
        }
        return result;
    }


}
