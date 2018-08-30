package com.chapter10.class3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xiaoxiaojing on 2018/8/30.
 */

@RestController
public class MyGetMethod {

    @RequestMapping(value = "/getcookies",method = RequestMethod.GET)
    public String getCookies(HttpServletResponse response){

        Cookie cookie = new Cookie("login","true");
        Cookie cookie1 = new Cookie("logincode","1");

        response.addCookie(cookie);
        response.addCookie(cookie1);

        return "恭喜你获得cookies成功";

    }

}
