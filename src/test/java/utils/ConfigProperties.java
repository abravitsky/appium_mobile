package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
    private static String configProperties;

    private ConfigProperties() {
    }

    public static String getConfigProperties(String key) {
        if (configProperties == null) {
            File configFile = new File("src/test/resources/config.properties");
            Properties properties = new Properties();
            try {
                properties.load(new FileInputStream(configFile));
            } catch (
                    IOException e) {
                e.printStackTrace();
            }
            return properties.getProperty(key);
        }
        return configProperties;
    }
}
