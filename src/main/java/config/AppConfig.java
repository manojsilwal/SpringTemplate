package config;

import controller.StudentController;
import error.GlobalHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.StudentService;

/**
 * Created by manoj on 10/31/2017.
 */
@Configuration
public class AppConfig {
    @Bean
    public StudentService service(){
        return new StudentService();
    }

    @Bean
    public StudentController controller(){
        return new StudentController();
    }

    @Bean
        public GlobalHandler exception(){
            return new GlobalHandler();
        }
}
