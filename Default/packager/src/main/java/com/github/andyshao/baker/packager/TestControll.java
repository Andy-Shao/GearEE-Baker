package com.github.andyshao.baker.packager;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.andyshaox.baker.core.PackagerConfig;

@RestController
public class TestControll {
    @Resource
    private PackagerConfig clouadPackagerConf;
    
    @RequestMapping("/packager/conf")
    public PackagerConfigVO getConf() {
        PackagerConfigVO result = new PackagerConfigVO();
        result.setMaxDiskSize(this.clouadPackagerConf.getMaxDiskSize().toString());
        result.setMaxTaskNum(this.clouadPackagerConf.getMaxTaskNum());
        result.setPackagerType(this.clouadPackagerConf.getPackagerType());
        result.setPerTaskMaxDiskSize(this.clouadPackagerConf.getPerTaskMaxDiskSize().toString());
        result.setValid(this.clouadPackagerConf.isValid());
        return result;
    }
}
