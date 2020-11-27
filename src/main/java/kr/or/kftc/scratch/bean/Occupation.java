package kr.or.kftc.scratch.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Occupation {

    private String position;
    private int since;

    @NestedConfigurationProperty
    private Company company;
}
