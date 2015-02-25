import com.ocs.config.AppConfig;
import com.ocs.entity.SampleEntity;
import com.ocs.spring.service.SampleEntityService;
import com.ocs.util.DateUtil;
import junit.framework.TestCase;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by Goodarzi on 02/01/2015.
 */
public class TestSampleEntity
        extends TestCase
{
    public void testSampleEntitySave(){
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("testContext.xml");

        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        SampleEntityService sampleEntityService = (SampleEntityService) ctx.getBean("SampleEntityService");

        SampleEntity sampleEntity = new SampleEntity();
        sampleEntity.setDescription(DateUtil.getStringDate());

        sampleEntityService.addSampleEntity(sampleEntity);
        System.out.println("inserted ..");
    }
}
