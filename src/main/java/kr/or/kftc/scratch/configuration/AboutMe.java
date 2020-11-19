package kr.or.kftc.scratch.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("test") // test 프로파일 일때만 빈으로 등록
@Component
@ConfigurationProperties(prefix="aboutme")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AboutMe {

    private String name;
    private String id;
    private int age;
    private String hobby;
    private String address;

    /* Occupation, Company를 inner class로 생성 시 반드시 static 으로 선언해야 설정을 로드(otherwise null) */
    /* 아래 어노테이션 없이도 설정값이 정상적으로 로드됨 */
    @NestedConfigurationProperty
    private Occupation occupation;

    public void print() {
        System.out.println("이름 : " + name);
        System.out.println("계정 : " + id);
        System.out.println("나이 : " + age);
        System.out.println("취미 : " + hobby);
        System.out.println("주소 : " + address);

        System.out.println("직위 : " + occupation.getPosition());
        System.out.println("입사년도 : " + occupation.getSince());

        System.out.println("회사명 : " + occupation.getCompany().getName());
        System.out.println("부서명 : " + occupation.getCompany().getDepartment());
        System.out.println("팀명 : " + occupation.getCompany().getTeam());
        System.out.println("직급 : " + occupation.getCompany().getRank());

        System.out.println("과거 담당업무 : ");
        for (String task : occupation.getCompany().getPreviousTask()) {
            System.out.println(" - " + task);
        }
    }

}
