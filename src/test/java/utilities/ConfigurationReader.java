package utilities;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    public ConfigurationReader() {
    }

    public static String getProperty(String key) {
        String path = "configuration.properties";

        try {
            FileInputStream stream = new FileInputStream(path);
            properties = new Properties();
            properties.load(stream);
            stream.close();
        } catch (FileNotFoundException var3) {
            var3.printStackTrace();
        } catch (IOException var4) {
            var4.printStackTrace();
        }

        return properties.getProperty(key);
    }
}
