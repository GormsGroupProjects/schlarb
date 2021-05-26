package org.schlarb.utility;

public class Utility {
    private Utility() {}
    public static void printMethodName() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        System.out.println(stackTrace[1].getClassName() + "." + stackTrace[1].getMethodName());
    }

    public static void printMethodName(String prefix) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[1].getClassName()+"."+stackTrace[1].getMethodName();
        System.out.println(prefix+methodName);
    }

    public static void printMethodName(String prefix, String suffix) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[1].getClassName()+"."+stackTrace[1].getMethodName();
        System.out.println(prefix+methodName+suffix);
    }

    public static String getMethodName() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        return stackTrace[1].getClassName()+"."+stackTrace[1].getMethodName();
    }
    public static void printCallingStack() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        for (StackTraceElement e: stackTrace)
            System.out.println(e.getClassName() + "." + e.getMethodName());
    }
}
