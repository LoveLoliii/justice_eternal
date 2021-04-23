package monster.loli.justice_eternal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "monster.loli.justice_eternal.*")
//非 mapper 结尾 出现 Invalid bound statement (not found) 错误
@MapperScan(basePackages = "monster.loli.*.mapper")
public class JusticeEternalApplication {

    public static void main(String[] args) {
        SpringApplication.run(JusticeEternalApplication.class, args);
    }

}
