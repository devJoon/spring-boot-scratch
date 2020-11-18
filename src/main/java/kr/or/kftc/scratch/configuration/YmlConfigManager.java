package kr.or.kftc.scratch.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("test") // test 프로파일 일때만 빈으로 등록
@Data
@Component
@ConfigurationProperties(prefix="root")
@AllArgsConstructor
@NoArgsConstructor
public class YmlConfigManager {

    String user;
    String id;

}
