package io.github.nitinbhatia499.framework.Config;

import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {
    private static Properties props = new Properties();

    static {
        try (InputStream input = ConfigLoader.class.getClassLoader()
                .getResourceAsStream("framework.properties")) {
            if (input == null) {
                throw new RuntimeException("framework.properties not found in resources!");
            }
            props.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load framework.properties", e);
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }

    public static int getInt(String key) {
        return Integer.parseInt(props.getProperty(key));
    }
}
