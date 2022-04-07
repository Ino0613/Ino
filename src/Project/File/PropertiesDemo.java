package Project.File;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties ppt = new Properties();
        ppt.put("2020210121", "张三");
        ppt.put("2020210122", "李四");
        ppt.put("2020210123", "王五");
        Set<Object> keySet = ppt.keySet();
        for (Object key : keySet) {
            Object value = ppt.get(key);
            System.out.println(value);
        }
    }
}
