package kr.or.kftc.scratch.bean;

import kr.or.kftc.scratch.bean.AboutMe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest 어노테이션을 통해 스프링부트 어플리케이션 테스트에 필요한 의존성을 제공

@SpringBootTest
class AboutMeTest {

    @Autowired
    AboutMe aboutMe;

    @BeforeEach
    void setup() {

    }

    @Test
    void print() {
        aboutMe.print();
    }

}