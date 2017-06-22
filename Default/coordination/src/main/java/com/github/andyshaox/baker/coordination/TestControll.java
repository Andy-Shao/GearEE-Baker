package com.github.andyshaox.baker.coordination;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControll {
    @Resource
    private CoordinationService coordinationService;
    
    @RequestMapping("/coordination/conf")
    public CoordinationService getConfig(){
        return this.coordinationService;
    }
}
