package kr.or.kftc.scratch;

import kr.or.kftc.scratch.configuration.AboutMe;
import kr.or.kftc.scratch.configuration.PropertyLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootScratchApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringBootScratchApplication.class, args);
        AboutMe aboutMe = applicationContext.getBean(AboutMe.class);

        aboutMe.print();

    }

}
