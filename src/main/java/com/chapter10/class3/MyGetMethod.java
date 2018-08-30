package com.chapter10.class3;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by xiaoxiaojing on 2018/8/30.
 */

@RestController  //告诉@ComponentScan当前类可被扫描
public class MyGetMethod {

    //注释请求的地址以及方法
    @RequestMapping(value = "/getcookies",method = RequestMethod.GET)
    /* 注意response不是参数，默认将res写在此处后会返回给页面 */
    public String getCookies(HttpServletResponse response){

        //HttpServerletRequest 装请求信息的类
        //HttpServerletResponse  装响应信息的类

        Cookie cookie = new Cookie("login","true");
        Cookie cookie1 = new Cookie("logincode","1");

        response.addCookie(cookie);
        response.addCookie(cookie1);

        return "恭喜你获得cookies成功";
    }


    /**
     * 要求客户端携带cookies访问
     * 这是一个需要携带cookies信息才能访问的get请求
     */
    @RequestMapping(value = "getwithcookies", method = RequestMethod.GET)
    public String getWithCookies(HttpServletRequest request){

        Cookie[] cookies = request.getCookies();

        if(Objects.isNull(cookies)){
            return "该请求必须携带cookies访问";
        }

        for(Cookie cookie:cookies){
            if(cookie.getName().equals("login") && cookie.getValue().equals("true")){
                for(Cookie cookie1:cookies){
                    if(cookie1.getName().equals("logincode") && cookie1.getValue().equals("1")){
                        return "cookies验证成功";
                    }
                }
            }
        }
        return "cookies不正确";
    }


    /**
     * 开发一个需要携带参数才能访问的get请求。
     * 第一种实现方式 url: key=value&key=value
     * 我们来模拟获取商品列表
     */
    @RequestMapping(value = "/getwithparam",method = RequestMethod.GET)
    public Map<String,Integer> getWithParam(@RequestParam Integer start,
                                            @RequestParam Integer end){
        Map<String,Integer> myList = new HashMap<>();
        myList.put("眼镜",500);
        myList.put("体恤",300);
        myList.put("牛仔裤",200);

        return myList;
    }


    /**
     * 第二种需要携带参数访问的get请求
     * url:ip:port/getwithparam/10/20
     */
    @RequestMapping(value = "/getwithvar/{start}/{end}",method = RequestMethod.GET)
    public Map<String,Integer> getWithVar(@PathVariable Integer start,
                                          @PathVariable Integer end){
        Map<String,Integer> myList = new HashMap<>();
        myList.put("眼镜",500);
        myList.put("体恤",300);
        myList.put("牛仔裤",200);

        return myList;
    }

}
