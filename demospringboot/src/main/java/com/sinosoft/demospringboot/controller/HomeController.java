package com.sinosoft.demospringboot.controller;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import cn.hutool.system.SystemUtil;
import com.sinosoft.demostarter1.service.DemoService;
import com.sinosoft.utils.DateUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jiangminyan
 * @create 2020-05-07 11:26
 **/
@RestController
public class HomeController {

    @Resource
    private DemoService demoService;

    @RequestMapping("/home")
    public String home(){

        JSONObject json = JSONUtil.createObj()
                                .put("currentTime", DateUtils.getCurrentDate())
                                .put("userinfo", SystemUtil.getUserInfo());

        return json.toString();
    }

    @GetMapping("/say")
    public String sayWhat(){
         return demoService.say();
    }

}
