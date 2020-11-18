package kr.or.kftc.scratch;

import kr.or.kftc.scratch.configuration.YmlConfigManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootScratchApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringBootScratchApplication.class, args);

        YmlConfigManager configManager = applicationContext.getBean(YmlConfigManager.class);

        System.out.println(configManager.getUser());
        System.out.println(configManager.getId());
    }

}
