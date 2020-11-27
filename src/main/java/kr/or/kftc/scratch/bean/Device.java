package kr.or.kftc.scratch.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="device")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device {

    private String kind;
    private String model;
    private String storage;
    private String price;

}
