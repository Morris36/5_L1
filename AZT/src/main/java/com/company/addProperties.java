package com.company;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ED
 */
public class addProperties {
    private final Properties properties = new Properties();

    /**
     * @param one Ключ
     * @param two Значение
     */
    public void newProperties(String one, String two) {
        properties.setProperty(one, two);
    }

    /**
     * @param one Ключ
     */
    public void delProperties(String one) {
        properties.remove(one);
    }

    public void saveProperties() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("myProperties");
        properties.store(fileOutputStream, "");
    }
}
