package eu.arima.configurationannotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(NotAnnotatedConfiguration.class)
public class ApplicationConfig {
}
