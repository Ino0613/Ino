package Project.File;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("2020210121", "王林");
        prop.setProperty("2020210122", "刘伟");

        System.out.println(prop);

        System.out.println(prop.getProperty("2020210121"));

        Set<String> names = prop.stringPropertyNames();
        for (String key : names) {
            String value = prop.getProperty(key);
            System.out.println(key + "," + value);
            System.out.println(value);
        }

    }
}
