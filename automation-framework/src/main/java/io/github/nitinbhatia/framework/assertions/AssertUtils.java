package io.github.nitinbhatia.framework.assertions;

public class AssertUtils {
    public static void assertTrue(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }
}

