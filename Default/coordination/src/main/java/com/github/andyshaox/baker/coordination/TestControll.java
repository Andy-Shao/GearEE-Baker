package com.github.andyshaox.baker.coordination;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.andyshaox.baker.core.CoordinationConfig;

@RestController
public class TestControll {
    @Resource
    private CoordinationConfig coordinationConfig;
    
    @RequestMapping("/coordination/conf")
    public CoordinationConfig getConfig(){
        return this.coordinationConfig;
    }
}
