import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by xiaoxiaojing on 2018/8/30.
 */

@SpringBootApplication  //托管
@ComponentScan("com.chapter10.class3")  //扫描组件，参数为扫描的包名
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);  //入口类：固定写法
    }

}
