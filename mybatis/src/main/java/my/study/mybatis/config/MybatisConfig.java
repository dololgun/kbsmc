package my.study.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("my.study.mybatis.**.dao")
public class MybatisConfig {

}
