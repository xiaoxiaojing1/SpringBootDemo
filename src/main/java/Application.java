import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by xiaoxiaojing on 2018/8/30.
 */

@SpringBootApplication
@ComponentScan("com.chapter10.class3")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
