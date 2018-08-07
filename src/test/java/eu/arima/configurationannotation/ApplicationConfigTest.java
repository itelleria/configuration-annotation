package eu.arima.configurationannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@ContextConfiguration(classes = ApplicationConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationConfigTest {

    @Autowired DemoServiceUsage demoServiceUsage1;

    @Autowired DemoServiceUsage demoServiceUsage2;

    /**
     * Add {@link org.springframework.context.annotation.Configuration} to {@link NotAnnotatedConfiguration} to
     * pass this test
     */
    @Test
    public void load() {
        assertNotNull(this.demoServiceUsage1);
        assertNotNull(this.demoServiceUsage2);

        assertEquals("DemoService should be singleton", demoServiceUsage1.demoService,
                demoServiceUsage2.demoService);
    }

}