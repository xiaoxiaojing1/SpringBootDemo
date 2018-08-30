package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaoxiaojing on 2018/8/30.
 */


@Controller
@EnableAutoConfiguration  //两行注释说明将该类托管到spring中
public class SampleController {

    @RequestMapping("/")  //注释请求的地址以及方法
    @ResponseBody         //注释响应体
    String home(){return "Hello world!";}

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class,args);  //入口类：固定写法
    }
}
