package eu.arima.configurationannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@ContextConfiguration(classes = NotAnnotatedConfiguration.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class NotAnnotatedConfigurationTest {

    @Autowired DemoService demoService;

    @Test
    public void load() {
        assertNotNull(this.demoService);
    }

}