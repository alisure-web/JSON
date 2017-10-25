package test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ALISURE on 2017/3/14.
 */
@Controller
@RequestMapping("/testJson")
public class TestController {

    @RequestMapping("/index.html")
    public String Index(){
        System.out.println("Test...");
        return "index";
    }

    @RequestMapping(value="{path}",method = RequestMethod.GET)
    @ResponseBody
    public String getJson(@PathVariable String path){
        System.out.println(path + "........");
        return path;
    }
}
