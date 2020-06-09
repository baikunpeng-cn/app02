package cn.zzuli.app02.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.zzuli.app02.dao")
public class MybatisConfig {
}
