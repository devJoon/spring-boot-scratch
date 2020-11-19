package kr.or.kftc.scratch.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    private String name;
    private String department;
    private String team;
    private String rank;
    private List<String> previousTask;

}
