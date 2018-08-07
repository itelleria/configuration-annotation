package eu.arima.configurationannotation;

import org.springframework.context.annotation.Bean;

/**
 * Add {@link org.springframework.context.annotation.Configuration} to pass the failed test.
 */
public class NotAnnotatedConfiguration {

    @Bean
    public DemoService demoService() {
        return new DemoService();
    }

    @Bean
    public DemoServiceUsage demoServiceUsage1() {
        return new DemoServiceUsage(demoService());
    }

    @Bean
    public DemoServiceUsage demoServiceUsage2() {
        return new DemoServiceUsage(demoService());
    }

}
