package kr.or.kftc.scratch.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 외부 yml 파일에서 설정값을 로드하는 테스트
 * @TestPropertySource 의 location은 .yml 파일을 로드하지 못함(.properties 파일은 가능!)
 */

//@SpringBootTest
//@TestPropertySource(locations = "file:config/device.properties") // works with .properties file only
@SpringBootTest(properties = "spring.config.location=file:config/device.yml") // works
//@EnableConfigurationProperties(Device.class) // needed if Device class is not @Component
class DeviceTest {

    @Autowired
    Device device;

    @Value("${device.kind}")
    private String kind;

    @Test
    void printKind() {
        assertNotNull(kind);
        System.out.println(kind);
    }

    @Test
    void printDeviceSpec() {
        assertNotNull(device.getKind());
        assertNotNull(device.getModel());
        assertNotNull(device.getStorage());
        assertNotNull(device.getPrice());
        System.out.println(device);
    }

}