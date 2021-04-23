package monster.loli.justice_eternal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "monster.loli.justice_eternal.*")
//非 mapper 结尾 出现 Invalid bound statement (not found) 错误
@MapperScan(basePackages = "monster.loli.*.mapper")
@EnableSwagger2
@EnableWebMvc
@EnableOpenApi
public class JusticeEternalApplication {

    public static void main(String[] args) {
        SpringApplication.run(JusticeEternalApplication.class, args);
    }

}
