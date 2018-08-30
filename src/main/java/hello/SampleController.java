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

    @RequestMapping("/")
    @ResponseBody
    String home(){return "Hello world!";}

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class,args);
    }
}