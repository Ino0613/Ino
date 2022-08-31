package cc.yunmc;

import cc.yunmc.config.SpringConfig;
import cc.yunmc.domain.Account;
import cc.yunmc.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ac.getBean(AccountService.class);
        Account byId = accountService.findById(1);
        System.out.println(byId);
    }
}
