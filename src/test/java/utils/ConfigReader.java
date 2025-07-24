package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{

    private static Properties prop;

    // Load properties once during class loading
    static 
    {
        try 
        {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            prop.load(fis);
        } catch (IOException e) 
        {
            e.printStackTrace();
            throw new RuntimeException("Could not load config.properties file");
        }
    }
    public static String get(String key)
    {
        String value = prop.getProperty(key);
        if (value == null) 
        {
            throw new RuntimeException("Property key '" + key + "' not found in config.properties");
        }
        return value.trim();
    }
    public static long getImplicitWait() 
    {
        String value = prop.getProperty("implicitWait");
        if (value == null) {
            throw new RuntimeException("Property key 'implicitWait' not found in config.properties");
        }
        try {
            return Long.parseLong(value.trim());
        } catch (NumberFormatException e) {
            throw new RuntimeException("Unable to parse 'implicitWait' value: " + value);
        }
}
}
