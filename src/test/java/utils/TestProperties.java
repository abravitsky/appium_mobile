package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    private static String testProperties;

    private TestProperties() {
    }

    public static String getTestProperties(String key) {
        if (testProperties == null) {
            File configFile = new File("src/test/resources/test.properties");
            Properties properties = new Properties();
            try {
                properties.load(new FileInputStream(configFile));
            } catch (
                    IOException e) {
                e.printStackTrace();
            }
            return properties.getProperty(key);
        }
        return testProperties;
    }
}
