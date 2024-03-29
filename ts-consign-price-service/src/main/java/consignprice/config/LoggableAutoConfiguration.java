package consignprice.config;


//import com.septemberhx.mclient.annotation.Loggable;

import com.mbs.mclient.annotation.Loggable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@Configuration
//@EnableAspectJAutoProxy
//@ComponentScan(basePackages = "com.example.myservice.aspect")
//public class LoggableAutoConfiguration {
//    // ...
//}
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.mbs.mclient.aspect")
@ConditionalOnClass(Loggable.class)
public class LoggableAutoConfiguration {

    // ...
}