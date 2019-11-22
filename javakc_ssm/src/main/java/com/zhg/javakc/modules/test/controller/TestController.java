package com.zhg.javakc.modules.test.controller;


import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.modules.test.entity.TestEntity;
import com.zhg.javakc.modules.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService testService;
    /**
     * 查询
     */
    @RequestMapping("/query")
    public ModelAndView query(TestEntity testEntity, HttpServletResponse response, HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView("system/test/list");
        Page<TestEntity> page=testService.query(testEntity,new Page<TestEntity>(request,response));
        modelAndView.addObject("page",page);
       // System.out.println(page.getList().get(0).getTestName());
        return modelAndView;
    }
}
