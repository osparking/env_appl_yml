package space.bum.env_var.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class EnvTest {
  @Value("${spring.application.name}")
  private String appName;
  
  @Value("${java.home}")
  private String javaHome;
  
  @Value("${environment.name}")
  private String osName;
  
  @Value("${client_id_facebook}")
  private String client_id_facebook;
  
  @Bean
  CommandLineRunner envAppPropChecker() {
    return (args) -> {
      log.info("응용이름: {} ", appName);
      log.info("자바 설치 홈: {} ", javaHome);
      log.info("운영체제: {} ", osName);
      log.info("페북 ID: {} ", client_id_facebook);
    };
  }
}
