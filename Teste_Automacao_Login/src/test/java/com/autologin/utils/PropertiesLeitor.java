package com.autologin.utils;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesLeitor {

    private static Properties properties = new Properties();

    public static String getProperty(String key) {
        if (properties.isEmpty()) {
            try (InputStream input = PropertiesLeitor.class.getClassLoader()
                    .getResourceAsStream("config.properties")) {
                if (input == null) {
                    System.out.println("Arquivo config.properties não encontrado em src/test/resources");
                    return null;
                }
                properties.load(input);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return properties.getProperty(key);
    }
}