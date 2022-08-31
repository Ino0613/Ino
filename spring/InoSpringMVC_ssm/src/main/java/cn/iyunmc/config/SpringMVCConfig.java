package cn.iyunmc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("cn.iyunmc.controller")
@EnableWebMvc
public class SpringMVCConfig {
}
