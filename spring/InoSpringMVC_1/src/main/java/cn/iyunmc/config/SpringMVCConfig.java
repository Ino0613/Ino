package cn.iyunmc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//3. 创建springmvc的配置文件，夹杂子controller对应的bean
@Configuration
@ComponentScan("cn.iyunmc.controller")
@EnableWebMvc
public class SpringMVCConfig {
}
