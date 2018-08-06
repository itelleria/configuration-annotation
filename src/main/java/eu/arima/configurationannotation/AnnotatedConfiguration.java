package eu.arima.configurationannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotatedConfiguration {

    @Bean
    public DemoService demoService() {
        return new DemoService();
    }

}
