package sample.test;

import com.alipay.sofa.ark.springboot.runner.ArkBootRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sample.service.SampleService;

@RunWith(ArkBootRunner.class)
@SpringBootTest
public class SampleServiceTest {
    @Autowired
    private SampleService sampleService;

    @Test
    public void testSampleService() {
        Assert.assertNotNull(sampleService);
        String result = sampleService.echo("abc");
        Assert.assertEquals("abc", result);
    }
}
