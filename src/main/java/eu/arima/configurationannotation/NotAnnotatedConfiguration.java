package eu.arima.configurationannotation;

import org.springframework.context.annotation.Bean;

public class NotAnnotatedConfiguration {

    @Bean
    public DemoService demoService() {
        return new DemoService();
    }

}
