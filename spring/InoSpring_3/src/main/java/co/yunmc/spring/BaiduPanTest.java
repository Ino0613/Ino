package co.yunmc.spring;

import co.yunmc.spring.config.SpringConfig;
import co.yunmc.spring.service.ResourcesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BaiduPanTest {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService resourcesService = ac.getBean(ResourcesService.class);
        boolean openURL1 = resourcesService.openURL("https://pan.baidu.com/test", "root");
        System.out.println(openURL1);

    }
}
